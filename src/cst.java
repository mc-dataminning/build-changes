import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cst implements csf<blp> {
   protected final csc a;
   protected final cpd b;
   private final csk<?> d;
   private final csj<?> e;
   protected final String c;

   public cst(csk<?> $$0, csj<?> $$1, String $$2, csc $$3, cpd $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public csk<?> e() {
      return this.d;
   }

   @Override
   public csj<?> at_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cpd a(iw $$0) {
      return this.b;
   }

   @Override
   public is<csc> a() {
      is<csc> $$0 = is.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cpd a(blp $$0, iw $$1) {
      return this.b.q();
   }

   public interface a<T extends cst> {
      T create(String var1, csc var2, cpd var3);
   }

   public static class b<T extends cst> implements csj<T> {
      final cst.a<T> x;
      private final Codec<T> y;
      private final xo<vb, T> z;

      protected b(cst.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     avq.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                     csc.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cpd.e.forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.z = xo.a(xm.h, $$0x -> $$0x.c, csc.b, $$0x -> $$0x.a, cpd.f, $$0x -> $$0x.b, $$0::create);
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
