import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cqs implements cqr {
   final cpy a;
   final cpy b;
   final cpy c;
   final cmx d;

   public cqs(cpy $$0, cpy $$1, cpy $$2, cmx $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bjt $$0, cto $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cmx a(bjt $$0, iu $$1) {
      cmx $$2 = this.d.p();
      sn $$3 = $$0.a(1).v();
      if ($$3 != null) {
         $$2.c($$3.h());
      }

      return $$2;
   }

   @Override
   public cmx a(iu $$0) {
      return this.d;
   }

   @Override
   public boolean a(cmx $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cmx $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cmx $$0) {
      return this.c.a($$0);
   }

   @Override
   public cqf<?> ar_() {
      return cqf.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cpy::c);
   }

   public static class a implements cqf<cqs> {
      private static final Codec<cqs> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cpy.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cpy.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cpy.b.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cmx.c.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cqs::new)
      );

      @Override
      public Codec<cqs> a() {
         return x;
      }

      public cqs b(ui $$0) {
         cpy $$1 = cpy.b($$0);
         cpy $$2 = cpy.b($$0);
         cpy $$3 = cpy.b($$0);
         cmx $$4 = $$0.r();
         return new cqs($$1, $$2, $$3, $$4);
      }

      public void a(ui $$0, cqs $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
         $$0.a($$1.d);
      }
   }
}
