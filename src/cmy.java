import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cmy implements cmx {
   final cmg a;
   final cmg b;
   final cmg c;
   final cjf d;

   public cmy(cmg $$0, cmg $$1, cmg $$2, cjf $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bgr $$0, cpv $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cjf a(bgr $$0, hr $$1) {
      cjf $$2 = this.d.p();
      qw $$3 = $$0.a(1).v();
      if ($$3 != null) {
         $$2.c($$3.h());
      }

      return $$2;
   }

   @Override
   public cjf a(hr $$0) {
      return this.d;
   }

   @Override
   public boolean a(cjf $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cjf $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cjf $$0) {
      return this.c.a($$0);
   }

   @Override
   public cmm<?> an_() {
      return cmm.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cmg::c);
   }

   public static class a implements cmm<cmy> {
      private static final Codec<cmy> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cmg.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cmg.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cmg.b.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cma.a.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cmy::new)
      );

      @Override
      public Codec<cmy> a() {
         return x;
      }

      public cmy b(so $$0) {
         cmg $$1 = cmg.b($$0);
         cmg $$2 = cmg.b($$0);
         cmg $$3 = cmg.b($$0);
         cjf $$4 = $$0.q();
         return new cmy($$1, $$2, $$3, $$4);
      }

      public void a(so $$0, cmy $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
         $$0.a($$1.d);
      }
   }
}
