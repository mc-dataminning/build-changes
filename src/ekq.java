import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.IntFunction;

public class ekq extends eim {
   public static final MapCodec<ekq> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(a($$0), ekq.a.c.fieldOf("mineshaft_type").forGetter($$0x -> $$0x.e)).apply($$0, ekq::new)
   );
   private final ekq.a e;

   public ekq(eim.c $$0, ekq.a $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<eim.b> a(eim.a $$0) {
      $$0.f().j();
      dbh $$1 = $$0.h();
      iz $$2 = new iz($$1.b(), 50, $$1.e());
      eje $$3 = new eje();
      int $$4 = this.a($$3, $$0);
      return Optional.of(new eim.b($$2.b(0, $$4, 0), Either.right($$3)));
   }

   private int a(eje $$0, eim.a $$1) {
      dbh $$2 = $$1.h();
      dyv $$3 = $$1.f();
      dub $$4 = $$1.b();
      ekp.d $$5 = new ekp.d(0, $$3, $$2.a(2), $$2.b(2), this.e);
      $$0.a($$5);
      $$5.a($$5, $$0, $$3);
      int $$6 = $$4.f();
      if (this.e == ekq.a.b) {
         iz $$7 = $$0.d().g();
         int $$8 = $$4.a($$7.u(), $$7.w(), dxw.a.a, $$1.i(), $$1.d());
         int $$9 = $$8 <= $$6 ? $$6 : ayz.b($$3, $$6, $$8);
         int $$10 = $$9 - $$7.v();
         $$0.a($$10);
         return $$10;
      } else {
         return $$0.a($$6, $$4.g(), $$3, 10);
      }
   }

   @Override
   public eiv<?> e() {
      return eiv.h;
   }

   public static enum a implements azu {
      a("normal", dfd.U, dfd.n, dfd.dU),
      b("mesa", dfd.aa, dfd.t, dfd.ki);

      public static final Codec<ekq.a> c = azu.a(ekq.a::values);
      private static final IntFunction<ekq.a> d = axp.a(Enum::ordinal, values(), axp.a.a);
      private final String e;
      private final dse f;
      private final dse g;
      private final dse h;

      private a(final String $$0, final dfb $$1, final dfb $$2, final dfb $$3) {
         this.e = $$0;
         this.f = $$1.o();
         this.g = $$2.o();
         this.h = $$3.o();
      }

      public String a() {
         return this.e;
      }

      public static ekq.a a(int $$0) {
         return d.apply($$0);
      }

      public dse b() {
         return this.f;
      }

      public dse d() {
         return this.g;
      }

      public dse e() {
         return this.h;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
