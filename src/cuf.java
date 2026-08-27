import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class cuf implements cud {
   final ctk a;
   final ctk b;
   final ctk c;

   public cuf(ctk $$0, ctk $$1, ctk $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bmv $$0, cwz $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public cqk a(bmv $$0, iz $$1) {
      cqk $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<il.c<csn>> $$3 = cso.a($$1, $$0.a(2));
         Optional<il.c<csp>> $$4 = csq.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            Optional<csm> $$5 = csm.a($$1, $$2, false);
            if ($$5.isPresent() && $$5.get().a($$4.get(), $$3.get())) {
               return cqk.h;
            }

            cqk $$6 = $$2.q();
            $$6.f(1);
            csm $$7 = new csm($$3.get(), $$4.get());
            if (csm.a($$1, $$6, $$7)) {
               return $$6;
            }
         }
      }

      return cqk.h;
   }

   @Override
   public cqk a(iz $$0) {
      cqk $$1 = new cqk(cqn.pG);
      Optional<il.c<csp>> $$2 = $$0.d(kj.aK).h().findFirst();
      if ($$2.isPresent()) {
         Optional<il.c<csn>> $$3 = $$0.d(kj.aJ).b(cso.d);
         if ($$3.isPresent()) {
            csm $$4 = new csm($$3.get(), $$2.get());
            csm.a($$0, $$1, $$4);
         }
      }

      return $$1;
   }

   @Override
   public boolean a(cqk $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(cqk $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(cqk $$0) {
      return this.c.a($$0);
   }

   @Override
   public ctr<?> ar_() {
      return ctr.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(ctk::c);
   }

   public static class a implements ctr<cuf> {
      private static final Codec<cuf> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ctk.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  ctk.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  ctk.c.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, cuf::new)
      );
      public static final xs<vf, cuf> x = xs.a(cuf.a::a, cuf.a::a);

      @Override
      public Codec<cuf> a() {
         return y;
      }

      @Override
      public xs<vf, cuf> b() {
         return x;
      }

      private static cuf a(vf $$0) {
         ctk $$1 = ctk.b.decode($$0);
         ctk $$2 = ctk.b.decode($$0);
         ctk $$3 = ctk.b.decode($$0);
         return new cuf($$1, $$2, $$3);
      }

      private static void a(vf $$0, cuf $$1) {
         ctk.b.encode($$0, $$1.a);
         ctk.b.encode($$0, $$1.b);
         ctk.b.encode($$0, $$1.c);
      }
   }
}
