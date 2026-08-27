import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class dww extends duz {
   public static final Codec<dww> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dww.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, dww::new)
   );
   private final dww.a e;

   public dww(duz.c $$0, dww.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<duz.b> a(duz.a $$0) {
      $$0.f().j();
      cot $$1 = $$0.h();
      gu $$2 = new gu($$1.b(), 50, $$1.e());
      dvr $$3 = new dvr();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new duz.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(dvr $$0, duz.a $$1) {
      cot $$2 = $$1.h();
      dli $$3 = $$1.f();
      dgx $$4 = $$1.b();
      dwv.d $$5 = new dwv.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.e();
      if (this.e == dww.a.b) {
         gu $$7 = $$0.d().f();
         int $$8 = $$4.a($$7.u(), $$7.w(), dkj.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : arp.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.f(), $$3, 10);
      }
   }

   @Override
   public dvi<?> e() {
      return dvi.h;
   }

   public static enum a implements ash {
      a("normal", csn.U, csn.n, csn.dU),
      b("mesa", csn.aa, csn.t, csn.ki);

      public static final Codec<dww.a> c = ash.a(dww.a::values);
      private static final IntFunction<dww.a> d = aqk.a(Enum::ordinal, values(), aqk.a.a);
      private final String e;
      private final dfa f;
      private final dfa g;
      private final dfa h;

      private a(String $$0, csm $$1, csm $$2, csm $$3) {
         this.e = $$0;
         this.f = $$1.n();
         this.g = $$2.n();
         this.h = $$3.n();
      }

      public String a() {
         return this.e;
      }

      public static dww.a a(int $$0) {
         return d.apply($$0);
      }

      public dfa b() {
         return this.f;
      }

      public dfa d() {
         return this.g;
      }

      public dfa e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
