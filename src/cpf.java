import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class cpf implements cpd {
   final cok a;
   final cok b;
   final cok c;

   cpf(cok $$0, cok $$1, cok $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(biq $$0, csa $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public clj a(biq $$0, ip $$1) {
      clj $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<ib.c<cnm>> $$3 = cnn.a($$1, $$0.a(2));
         Optional<ib.c<cno>> $$4 = cnp.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            Optional<cnl> $$5 = cnl.a($$1, $$2, false);
            if ($$5.isPresent() && $$5.get().a($$4.get(), $$3.get())) {
               return clj.b;
            }

            clj $$6 = $$2.p();
            $$6.f(1);
            cnl $$7 = new cnl($$3.get(), $$4.get());
            if (cnl.a($$1, $$6, $$7)) {
               return $$6;
            }
         }
      }

      return clj.b;
   }

   @Override
   public clj a(ip $$0) {
      clj $$1 = new clj(clm.pE);
      Optional<ib.c<cno>> $$2 = $$0.d(jz.aG).h().findFirst();
      if ($$2.isPresent()) {
         Optional<ib.c<cnm>> $$3 = $$0.d(jz.aF).b(cnn.d);
         if ($$3.isPresent()) {
            cnl $$4 = new cnl($$3.get(), $$2.get());
            cnl.a($$0, $$1, $$4);
         }
      }

      return $$1;
   }

   @Override
   public boolean a(clj $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(clj $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(clj $$0) {
      return this.c.a($$0);
   }

   @Override
   public cos<?> aq_() {
      return cos.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cok::c);
   }

   public static class a implements cos<cpf> {
      private static final Codec<cpf> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cok.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cok.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cok.b.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, cpf::new)
      );

      @Override
      public Codec<cpf> a() {
         return x;
      }

      public cpf b(tu $$0) {
         cok $$1 = cok.b($$0);
         cok $$2 = cok.b($$0);
         cok $$3 = cok.b($$0);
         return new cpf($$1, $$2, $$3);
      }

      public void a(tu $$0, cpf $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
      }
   }
}
