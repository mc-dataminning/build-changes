import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cqm implements cql {
   final cps a;
   final cps b;
   final cps c;
   final cmr d;

   public cqm(cps $$0, cps $$1, cps $$2, cmr $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bjo $$0, cti $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cmr a(bjo $$0, iu $$1) {
      cmr $$2 = this.d.p();
      sl $$3 = $$0.a(1).v();
      if ($$3 != null) {
         $$2.c($$3.h());
      }

      return $$2;
   }

   @Override
   public cmr a(iu $$0) {
      return this.d;
   }

   @Override
   public boolean a(cmr $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cmr $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cmr $$0) {
      return this.c.a($$0);
   }

   @Override
   public cpz<?> ar_() {
      return cpz.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cps::c);
   }

   public static class a implements cpz<cqm> {
      private static final Codec<cqm> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cps.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cps.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cps.b.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cmr.c.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cqm::new)
      );

      @Override
      public Codec<cqm> a() {
         return x;
      }

      public cqm b(ug $$0) {
         cps $$1 = cps.b($$0);
         cps $$2 = cps.b($$0);
         cps $$3 = cps.b($$0);
         cmr $$4 = $$0.r();
         return new cqm($$1, $$2, $$3, $$4);
      }

      public void a(ug $$0, cqm $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
         $$0.a($$1.d);
      }
   }
}
