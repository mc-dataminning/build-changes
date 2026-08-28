import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class dxn implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<dxm> c = new Long2ObjectLinkedOpenHashMap();
   private final dxp d;
   private final Path e;
   private final boolean f;

   dxn(dxp $$0, Path $$1, boolean $$2) {
      this.e = $$1;
      this.f = $$2;
      this.d = $$0;
   }

   private dxm b(dcy $$0) throws IOException {
      long $$1 = dcy.c($$0.h(), $$0.i());
      dxm $$2 = (dxm)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((dxm)this.c.removeLast()).close();
         }

         v.c(this.e);
         Path $$3 = this.e.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         dxm $$4 = new dxm(this.d, $$3, this.e, this.f);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public uf a(dcy $$0) throws IOException {
      dxm $$1 = this.b($$0);

      uf var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = us.a($$2);
      }

      return var4;
   }

   public void a(dcy $$0, uz $$1) throws IOException {
      dxm $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            us.a((DataInput)$$3, $$1, uo.a());
         }
      }
   }

   protected void a(dcy $$0, @Nullable uf $$1) throws IOException {
      dxm $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            us.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      ayk<IOException> $$0 = new ayk<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         dxm $$1 = (dxm)var2.next();

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
         dxm $$0 = (dxm)var1.next();
         $$0.b();
      }
   }

   public dxp b() {
      return this.d;
   }
}
