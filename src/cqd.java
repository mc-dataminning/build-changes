import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class cqd implements cqb {
   final cpi a;
   final cpi b;
   final cpi c;

   public cqd(cpi $$0, cpi $$1, cpi $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bje $$0, csy $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cmh a(bje $$0, is $$1) {
      cmh $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<ie.c<cok>> $$3 = col.a($$1, $$0.a(2));
         Optional<ie.c<com>> $$4 = coo.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            Optional<coj> $$5 = coj.a($$1, $$2, false);
            if ($$5.isPresent() && $$5.get().a($$4.get(), $$3.get())) {
               return cmh.f;
            }

            cmh $$6 = $$2.p();
            $$6.f(1);
            coj $$7 = new coj($$3.get(), $$4.get());
            if (coj.a($$1, $$6, $$7)) {
               return $$6;
            }
         }
      }

      return cmh.f;
   }

   @Override
   public cmh a(is $$0) {
      cmh $$1 = new cmh(cmk.pE);
      Optional<ie.c<com>> $$2 = $$0.d(kc.aI).h().findFirst();
      if ($$2.isPresent()) {
         Optional<ie.c<cok>> $$3 = $$0.d(kc.aH).b(col.d);
         if ($$3.isPresent()) {
            coj $$4 = new coj($$3.get(), $$2.get());
            coj.a($$0, $$1, $$4);
         }
      }

      return $$1;
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
      return cpp.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cpi::c);
   }

   public static class a implements cpp<cqd> {
      private static final Codec<cqd> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cpi.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cpi.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cpi.b.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, cqd::new)
      );

      @Override
      public Codec<cqd> a() {
         return x;
      }

      public cqd b(ue $$0) {
         cpi $$1 = cpi.b($$0);
         cpi $$2 = cpi.b($$0);
         cpi $$3 = cpi.b($$0);
         return new cqd($$1, $$2, $$3);
      }

      public void a(ue $$0, cqd $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
      }
   }
}
