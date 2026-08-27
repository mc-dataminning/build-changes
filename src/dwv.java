import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class dwv extends duy {
   public static final Codec<dwv> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dwv.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, dwv::new)
   );
   private final dwv.a e;

   public dwv(duy.c $$0, dwv.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<duy.b> a(duy.a $$0) {
      $$0.f().j();
      cos $$1 = $$0.h();
      gu $$2 = new gu($$1.b(), 50, $$1.e());
      dvq $$3 = new dvq();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new duy.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(dvq $$0, duy.a $$1) {
      cos $$2 = $$1.h();
      dlh $$3 = $$1.f();
      dgw $$4 = $$1.b();
      dwu.d $$5 = new dwu.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.e();
      if (this.e == dwv.a.b) {
         gu $$7 = $$0.d().f();
         int $$8 = $$4.a($$7.u(), $$7.w(), dki.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : arp.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.f(), $$3, 10);
      }
   }

   @Override
   public dvh<?> e() {
      return dvh.h;
   }

   public static enum a implements ash {
      a("normal", csm.U, csm.n, csm.dU),
      b("mesa", csm.aa, csm.t, csm.ki);

      public static final Codec<dwv.a> c = ash.a(dwv.a::values);
      private static final IntFunction<dwv.a> d = aqk.a(Enum::ordinal, values(), aqk.a.a);
      private final String e;
      private final dez f;
      private final dez g;
      private final dez h;

      private a(String $$0, csl $$1, csl $$2, csl $$3) {
         this.e = $$0;
         this.f = $$1.n();
         this.g = $$2.n();
         this.h = $$3.n();
      }

      public String a() {
         return this.e;
      }

      public static dwv.a a(int $$0) {
         return d.apply($$0);
      }

      public dez b() {
         return this.f;
      }

      public dez d() {
         return this.g;
      }

      public dez e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
