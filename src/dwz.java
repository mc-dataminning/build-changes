import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class dwz extends dvc {
   public static final Codec<dwz> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dwz.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, dwz::new)
   );
   private final dwz.a e;

   public dwz(dvc.c $$0, dwz.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dvc.b> a(dvc.a $$0) {
      $$0.f().j();
      cpi $$1 = $$0.h();
      gw $$2 = new gw($$1.b(), 50, $$1.e());
      dvu $$3 = new dvu();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new dvc.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(dvu $$0, dvc.a $$1) {
      cpi $$2 = $$1.h();
      dll $$3 = $$1.f();
      dha $$4 = $$1.b();
      dwy.d $$5 = new dwy.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.e();
      if (this.e == dwz.a.b) {
         gw $$7 = $$0.d().f();
         int $$8 = $$4.a($$7.u(), $$7.w(), dkm.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : asb.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.f(), $$3, 10);
      }
   }

   @Override
   public dvl<?> e() {
      return dvl.h;
   }

   public static enum a implements asu {
      a("normal", cte.U, cte.n, cte.dU),
      b("mesa", cte.aa, cte.t, cte.ki);

      public static final Codec<dwz.a> c = asu.a(dwz.a::values);
      private static final IntFunction<dwz.a> d = aqu.a(Enum::ordinal, values(), aqu.a.a);
      private final String e;
      private final dfd f;
      private final dfd g;
      private final dfd h;

      private a(String $$0, ctc $$1, ctc $$2, ctc $$3) {
         this.e = $$0;
         this.f = $$1.o();
         this.g = $$2.o();
         this.h = $$3.o();
      }

      public String a() {
         return this.e;
      }

      public static dwz.a a(int $$0) {
         return d.apply($$0);
      }

      public dfd b() {
         return this.f;
      }

      public dfd d() {
         return this.g;
      }

      public dfd e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
