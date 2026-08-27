import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cmt implements cms {
   final cmb a;
   final cmb b;
   final cmb c;
   final cja d;

   public cmt(cmb $$0, cmb $$1, cmb $$2, cja $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bgm $$0, cpq $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cja a(bgm $$0, hu $$1) {
      cja $$2 = this.d.p();
      qu $$3 = $$0.a(1).v();
      if ($$3 != null) {
         $$2.c($$3.h());
      }

      return $$2;
   }

   @Override
   public cja a(hu $$0) {
      return this.d;
   }

   @Override
   public boolean a(cja $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cja $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cja $$0) {
      return this.c.a($$0);
   }

   @Override
   public cmh<?> ai_() {
      return cmh.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cmb::c);
   }

   public static class a implements cmh<cmt> {
      private static final Codec<cmt> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cmb.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cmb.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cmb.b.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  clv.a.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cmt::new)
      );

      @Override
      public Codec<cmt> a() {
         return x;
      }

      public cmt b(sl $$0) {
         cmb $$1 = cmb.b($$0);
         cmb $$2 = cmb.b($$0);
         cmb $$3 = cmb.b($$0);
         cja $$4 = $$0.q();
         return new cmt($$1, $$2, $$3, $$4);
      }

      public void a(sl $$0, cmt $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
         $$0.a($$1.d);
      }
   }
}
