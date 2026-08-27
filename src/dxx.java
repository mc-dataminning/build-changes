import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class dxx extends dwa {
   public static final Codec<dxx> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), dxx.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, dxx::new)
   );
   private final dxx.a e;

   public dxx(dwa.c $$0, dxx.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dwa.b> a(dwa.a $$0) {
      $$0.f().j();
      cqg $$1 = $$0.h();
      ht $$2 = new ht($$1.b(), 50, $$1.e());
      dws $$3 = new dws();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new dwa.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(dws $$0, dwa.a $$1) {
      cqg $$2 = $$1.h();
      dmj $$3 = $$1.f();
      dhy $$4 = $$1.b();
      dxw.d $$5 = new dxw.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.e();
      if (this.e == dxx.a.b) {
         ht $$7 = $$0.d().f();
         int $$8 = $$4.a($$7.u(), $$7.w(), dlk.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : asy.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.f(), $$3, 10);
      }
   }

   @Override
   public dwj<?> e() {
      return dwj.h;
   }

   public static enum a implements atr {
      a("normal", cuc.U, cuc.n, cuc.dU),
      b("mesa", cuc.aa, cuc.t, cuc.ki);

      public static final Codec<dxx.a> c = atr.a(dxx.a::values);
      private static final IntFunction<dxx.a> d = arr.a(Enum::ordinal, values(), arr.a.a);
      private final String e;
      private final dgb f;
      private final dgb g;
      private final dgb h;

      private a(String $$0, cua $$1, cua $$2, cua $$3) {
         this.e = $$0;
         this.f = $$1.o();
         this.g = $$2.o();
         this.h = $$3.o();
      }

      public String a() {
         return this.e;
      }

      public static dxx.a a(int $$0) {
         return d.apply($$0);
      }

      public dgb b() {
         return this.f;
      }

      public dgb d() {
         return this.g;
      }

      public dgb e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
