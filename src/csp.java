import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class csp implements csb<bln> {
   protected final cry a;
   protected final coz b;
   private final csg<?> d;
   private final csf<?> e;
   protected final String c;

   public csp(csg<?> $$0, csf<?> $$1, String $$2, cry $$3, coz $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public csg<?> e() {
      return this.d;
   }

   @Override
   public csf<?> at_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public coz a(iw $$0) {
      return this.b;
   }

   @Override
   public is<cry> a() {
      is<cry> $$0 = is.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public coz a(bln $$0, iw $$1) {
      return this.b.q();
   }

   public interface a<T extends csp> {
      T create(String var1, cry var2, coz var3);
   }

   public static class b<T extends csp> implements csf<T> {
      final csp.a<T> x;
      private final Codec<T> y;
      private final xo<vb, T> z;

      protected b(csp.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     avp.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                     cry.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     coz.e.forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.z = xo.a(xm.h, $$0x -> $$0x.c, cry.b, $$0x -> $$0x.a, coz.f, $$0x -> $$0x.b, $$0::create);
      }

      @Override
      public Codec<T> a() {
         return this.y;
      }

      @Override
      public xo<vb, T> b() {
         return this.z;
      }
   }
}
