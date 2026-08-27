import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class cod implements cob {
   final cnk a;
   final cnk b;
   final cnk c;

   cod(cnk $$0, cnk $$1, cnk $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bhu $$0, cqz $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public ckj a(bhu $$0, ip $$1) {
      ckj $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<ib.c<cmm>> $$3 = cmn.a($$1, $$0.a(2));
         Optional<ib.c<cmo>> $$4 = cmp.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            Optional<cml> $$5 = cml.a($$1, $$2, false);
            if ($$5.isPresent() && $$5.get().a($$4.get(), $$3.get())) {
               return ckj.b;
            }

            ckj $$6 = $$2.p();
            $$6.f(1);
            cml $$7 = new cml($$3.get(), $$4.get());
            if (cml.a($$1, $$6, $$7)) {
               return $$6;
            }
         }
      }

      return ckj.b;
   }

   @Override
   public ckj a(ip $$0) {
      ckj $$1 = new ckj(ckm.oT);
      Optional<ib.c<cmo>> $$2 = $$0.d(jz.aF).h().findFirst();
      if ($$2.isPresent()) {
         Optional<ib.c<cmm>> $$3 = $$0.d(jz.aE).b(cmn.d);
         if ($$3.isPresent()) {
            cml $$4 = new cml($$3.get(), $$2.get());
            cml.a($$0, $$1, $$4);
         }
      }

      return $$1;
   }

   @Override
   public boolean a(ckj $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(ckj $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(ckj $$0) {
      return this.c.a($$0);
   }

   @Override
   public cnq<?> aq_() {
      return cnq.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cnk::c);
   }

   public static class a implements cnq<cod> {
      private static final Codec<cod> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cnk.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cnk.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cnk.b.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, cod::new)
      );

      @Override
      public Codec<cod> a() {
         return x;
      }

      public cod b(tl $$0) {
         cnk $$1 = cnk.b($$0);
         cnk $$2 = cnk.b($$0);
         cnk $$3 = cnk.b($$0);
         return new cod($$1, $$2, $$3);
      }

      public void a(tl $$0, cod $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
      }
   }
}
