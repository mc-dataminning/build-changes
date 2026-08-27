import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cqt implements cqs {
   final cpz a;
   final cpz b;
   final cpz c;
   final cmy d;

   public cqt(cpz $$0, cpz $$1, cpz $$2, cmy $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bju $$0, ctp $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cmy a(bju $$0, iu $$1) {
      cmy $$2 = this.d.p();
      sn $$3 = $$0.a(1).v();
      if ($$3 != null) {
         $$2.c($$3.h());
      }

      return $$2;
   }

   @Override
   public cmy a(iu $$0) {
      return this.d;
   }

   @Override
   public boolean a(cmy $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cmy $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cmy $$0) {
      return this.c.a($$0);
   }

   @Override
   public cqg<?> ar_() {
      return cqg.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cpz::c);
   }

   public static class a implements cqg<cqt> {
      private static final Codec<cqt> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cpz.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cpz.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cpz.b.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cmy.c.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cqt::new)
      );

      @Override
      public Codec<cqt> a() {
         return x;
      }

      public cqt b(ui $$0) {
         cpz $$1 = cpz.b($$0);
         cpz $$2 = cpz.b($$0);
         cpz $$3 = cpz.b($$0);
         cmy $$4 = $$0.r();
         return new cqt($$1, $$2, $$3, $$4);
      }

      public void a(ui $$0, cqt $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
         $$0.a($$1.d);
      }
   }
}
