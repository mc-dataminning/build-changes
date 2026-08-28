import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class eba implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<eaz> c = new Long2ObjectLinkedOpenHashMap();
   private final ebc d;
   private final Path e;
   private final boolean f;

   eba(ebc $$0, Path $$1, boolean $$2) {
      this.e = $$1;
      this.f = $$2;
      this.d = $$0;
   }

   private eaz b(dgf $$0) throws IOException {
      long $$1 = dgf.c($$0.h(), $$0.i());
      eaz $$2 = (eaz)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((eaz)this.c.removeLast()).close();
         }

         v.c(this.e);
         Path $$3 = this.e.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         eaz $$4 = new eaz(this.d, $$3, this.e, this.f);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public um a(dgf $$0) throws IOException {
      eaz $$1 = this.b($$0);

      um var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = uz.a($$2);
      }

      return var4;
   }

   public void a(dgf $$0, vg $$1) throws IOException {
      eaz $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            uz.a((DataInput)$$3, $$1, uv.a());
         }
      }
   }

   protected void a(dgf $$0, @Nullable um $$1) throws IOException {
      eaz $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            uz.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      azc<IOException> $$0 = new azc<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         eaz $$1 = (eaz)var2.next();

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
         eaz $$0 = (eaz)var1.next();
         $$0.b();
      }
   }

   public ebc b() {
      return this.d;
   }
}
