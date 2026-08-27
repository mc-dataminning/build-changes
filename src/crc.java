import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class crc implements cra {
   final cqh a;
   final cqh b;
   final cqh c;

   public crc(cqh $$0, cqh $$1, cqh $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bjv $$0, ctx $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cng a(bjv $$0, iu $$1) {
      cng $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<ih.c<cpk>> $$3 = cpl.a($$1, $$0.a(2));
         Optional<ih.c<cpm>> $$4 = cpn.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            Optional<cpj> $$5 = cpj.a($$1, $$2, false);
            if ($$5.isPresent() && $$5.get().a($$4.get(), $$3.get())) {
               return cng.f;
            }

            cng $$6 = $$2.p();
            $$6.f(1);
            cpj $$7 = new cpj($$3.get(), $$4.get());
            if (cpj.a($$1, $$6, $$7)) {
               return $$6;
            }
         }
      }

      return cng.f;
   }

   @Override
   public cng a(iu $$0) {
      cng $$1 = new cng(cnj.pG);
      Optional<ih.c<cpm>> $$2 = $$0.d(ke.aJ).h().findFirst();
      if ($$2.isPresent()) {
         Optional<ih.c<cpk>> $$3 = $$0.d(ke.aI).b(cpl.d);
         if ($$3.isPresent()) {
            cpj $$4 = new cpj($$3.get(), $$2.get());
            cpj.a($$0, $$1, $$4);
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cng $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cng $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cng $$0) {
      return this.c.a($$0);
   }

   @Override
   public cqo<?> at_() {
      return cqo.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cqh::c);
   }

   public static class a implements cqo<crc> {
      private static final Codec<crc> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cqh.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cqh.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cqh.b.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, crc::new)
      );

      @Override
      public Codec<crc> a() {
         return x;
      }

      public crc b(uj $$0) {
         cqh $$1 = cqh.b($$0);
         cqh $$2 = cqh.b($$0);
         cqh $$3 = cqh.b($$0);
         return new crc($$1, $$2, $$3);
      }

      public void a(uj $$0, crc $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
      }
   }
}
