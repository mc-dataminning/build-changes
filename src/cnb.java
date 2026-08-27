import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class cnb implements cmz {
   final cmi a;
   final cmi b;
   final cmi c;

   cnb(cmi $$0, cmi $$1, cmi $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bgt $$0, cpx $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cjh a(bgt $$0, hu $$1) {
      cjh $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<hg.c<clk>> $$3 = cll.a($$1, $$0.a(2));
         Optional<hg.c<clm>> $$4 = cln.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            Optional<clj> $$5 = clj.a($$1, $$2, false);
            if ($$5.isPresent() && $$5.get().a($$4.get(), $$3.get())) {
               return cjh.b;
            }

            cjh $$6 = $$2.p();
            $$6.f(1);
            clj $$7 = new clj($$3.get(), $$4.get());
            if (clj.a($$1, $$6, $$7)) {
               return $$6;
            }
         }
      }

      return cjh.b;
   }

   @Override
   public cjh a(hu $$0) {
      cjh $$1 = new cjh(cjk.oT);
      Optional<hg.c<clm>> $$2 = $$0.d(je.aE).h().findFirst();
      if ($$2.isPresent()) {
         Optional<hg.c<clk>> $$3 = $$0.d(je.aD).b(cll.d);
         if ($$3.isPresent()) {
            clj $$4 = new clj($$3.get(), $$2.get());
            clj.a($$0, $$1, $$4);
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cjh $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cjh $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cjh $$0) {
      return this.c.a($$0);
   }

   @Override
   public cmo<?> an_() {
      return cmo.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cmi::c);
   }

   public static class a implements cmo<cnb> {
      private static final Codec<cnb> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cmi.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cmi.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cmi.b.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, cnb::new)
      );

      @Override
      public Codec<cnb> a() {
         return x;
      }

      public cnb b(sq $$0) {
         cmi $$1 = cmi.b($$0);
         cmi $$2 = cmi.b($$0);
         cmi $$3 = cmi.b($$0);
         return new cnb($$1, $$2, $$3);
      }

      public void a(sq $$0, cnb $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
      }
   }
}
