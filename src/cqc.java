import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cqc implements cqb {
   final cpi a;
   final cpi b;
   final cpi c;
   final cmh d;

   public cqc(cpi $$0, cpi $$1, cpi $$2, cmh $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bje $$0, csy $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cmh a(bje $$0, is $$1) {
      cmh $$2 = this.d.p();
      sj $$3 = $$0.a(1).v();
      if ($$3 != null) {
         $$2.c($$3.h());
      }

      return $$2;
   }

   @Override
   public cmh a(is $$0) {
      return this.d;
   }

   @Override
   public boolean a(cmh $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cmh $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cmh $$0) {
      return this.c.a($$0);
   }

   @Override
   public cpp<?> ar_() {
      return cpp.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cpi::c);
   }

   public static class a implements cpp<cqc> {
      private static final Codec<cqc> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cpi.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cpi.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cpi.b.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  cmh.c.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cqc::new)
      );

      @Override
      public Codec<cqc> a() {
         return x;
      }

      public cqc b(ue $$0) {
         cpi $$1 = cpi.b($$0);
         cpi $$2 = cpi.b($$0);
         cpi $$3 = cpi.b($$0);
         cmh $$4 = $$0.r();
         return new cqc($$1, $$2, $$3, $$4);
      }

      public void a(ue $$0, cqc $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
         $$0.a($$1.d);
      }
   }
}
