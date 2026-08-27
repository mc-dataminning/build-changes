import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class cnf implements cnd {
   final cmm a;
   final cmm b;
   final cmm c;

   cnf(cmm $$0, cmm $$1, cmm $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bgx $$0, cqb $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cjl a(bgx $$0, hr $$1) {
      cjl $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<he.c<clo>> $$3 = clp.a($$1, $$0.a(2));
         Optional<he.c<clq>> $$4 = clr.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            Optional<cln> $$5 = cln.a($$1, $$2, false);
            if ($$5.isPresent() && $$5.get().a($$4.get(), $$3.get())) {
               return cjl.b;
            }

            cjl $$6 = $$2.p();
            $$6.f(1);
            cln $$7 = new cln($$3.get(), $$4.get());
            if (cln.a($$1, $$6, $$7)) {
               return $$6;
            }
         }
      }

      return cjl.b;
   }

   @Override
   public cjl a(hr $$0) {
      cjl $$1 = new cjl(cjo.oT);
      Optional<he.c<clq>> $$2 = $$0.d(jc.aF).h().findFirst();
      if ($$2.isPresent()) {
         Optional<he.c<clo>> $$3 = $$0.d(jc.aE).b(clp.d);
         if ($$3.isPresent()) {
            cln $$4 = new cln($$3.get(), $$2.get());
            cln.a($$0, $$1, $$4);
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cjl $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cjl $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cjl $$0) {
      return this.c.a($$0);
   }

   @Override
   public cms<?> an_() {
      return cms.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cmm::c);
   }

   public static class a implements cms<cnf> {
      private static final Codec<cnf> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cmm.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cmm.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cmm.b.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, cnf::new)
      );

      @Override
      public Codec<cnf> a() {
         return x;
      }

      public cnf b(so $$0) {
         cmm $$1 = cmm.b($$0);
         cmm $$2 = cmm.b($$0);
         cmm $$3 = cmm.b($$0);
         return new cnf($$1, $$2, $$3);
      }

      public void a(so $$0, cnf $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
      }
   }
}
