import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class dul implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<duk> c = new Long2ObjectLinkedOpenHashMap();
   private final dun d;
   private final Path e;
   private final boolean f;

   dul(dun $$0, Path $$1, boolean $$2) {
      this.e = $$1;
      this.f = $$2;
      this.d = $$0;
   }

   private duk b(dae $$0) throws IOException {
      long $$1 = dae.c($$0.h(), $$0.i());
      duk $$2 = (duk)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((duk)this.c.removeLast()).close();
         }

         v.c(this.e);
         Path $$3 = this.e.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         duk $$4 = new duk(this.d, $$3, this.e, this.f);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public ud a(dae $$0) throws IOException {
      duk $$1 = this.b($$0);

      ud var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = uq.a($$2);
      }

      return var4;
   }

   public void a(dae $$0, ux $$1) throws IOException {
      duk $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            uq.a((DataInput)$$3, $$1, um.a());
         }
      }
   }

   protected void a(dae $$0, @Nullable ud $$1) throws IOException {
      duk $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            uq.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      axl<IOException> $$0 = new axl<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         duk $$1 = (duk)var2.next();

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
         duk $$0 = (duk)var1.next();
         $$0.b();
      }
   }
}
