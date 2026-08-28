import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class dwq implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<dwp> c = new Long2ObjectLinkedOpenHashMap();
   private final dws d;
   private final Path e;
   private final boolean f;

   dwq(dws $$0, Path $$1, boolean $$2) {
      this.e = $$1;
      this.f = $$2;
      this.d = $$0;
   }

   private dwp b(dcd $$0) throws IOException {
      long $$1 = dcd.c($$0.h(), $$0.i());
      dwp $$2 = (dwp)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((dwp)this.c.removeLast()).close();
         }

         v.c(this.e);
         Path $$3 = this.e.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         dwp $$4 = new dwp(this.d, $$3, this.e, this.f);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public ub a(dcd $$0) throws IOException {
      dwp $$1 = this.b($$0);

      ub var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = uo.a($$2);
      }

      return var4;
   }

   public void a(dcd $$0, uv $$1) throws IOException {
      dwp $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            uo.a((DataInput)$$3, $$1, uk.a());
         }
      }
   }

   protected void a(dcd $$0, @Nullable ub $$1) throws IOException {
      dwp $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            uo.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      axv<IOException> $$0 = new axv<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         dwp $$1 = (dwp)var2.next();

         try {
            $$1.close();
         } catch (IOException var5) {
            $$0.a(var5);
         }
      }

      $$0.a();
   }

   public void a() throws IOException {
      ObjectIterator var1 = this.c.values().iterator();

      while (var1.hasNext()) {
         dwp $$0 = (dwp)var1.next();
         $$0.b();
      }
   }

   public dws b() {
      return this.d;
   }
}
