import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ddx implements dcy {
   final ddy c;
   final cys d;
   final String e;
   final dcw f;
   final boolean g;
   @Nullable
   private ddi h;

   public ddx(String $$0, dcw $$1, ddy $$2, cys $$3, boolean $$4) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
      this.g = $$4;
   }

   public ddx(String $$0, dcw $$1, ddy $$2, cys $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public ddt<? extends ddx> a() {
      return ddt.a;
   }

   @Override
   public String j() {
      return this.e;
   }

   @Override
   public dcw c() {
      return this.f;
   }

   @VisibleForTesting
   public List<Optional<ddf>> f() {
      return this.c.c();
   }

   @Override
   public ddi ak_() {
      if (this.h == null) {
         this.h = ddi.a(this.c.c());
      }

      return this.h;
   }

   @Override
   public boolean i() {
      return this.g;
   }

   public boolean a(dcx $$0, dip $$1) {
      return this.c.a($$0);
   }

   public cys a(dcx $$0, jg.a $$1) {
      return this.d.v();
   }

   public int k() {
      return this.c.a();
   }

   public int l() {
      return this.c.b();
   }

   @Override
   public List<dep> g() {
      return List.of(
         new det(this.c.a(), this.c.b(), this.c.c().stream().map($$0 -> $$0.<dev>map(ddf::c).orElse(dev.c.c)).toList(), new dev.f(this.d), new dev.d(cyw.fe))
      );
   }

   public static class a implements ddt<ddx> {
      public static final MapCodec<ddx> w = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.e),
                  dcw.e.fieldOf("category").orElse(dcw.d).forGetter($$0x -> $$0x.f),
                  ddy.b.forGetter($$0x -> $$0x.c),
                  cys.d.fieldOf("result").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ddx::new)
      );
      public static final yu<wh, ddx> x = yu.a(ddx.a::a, ddx.a::a);

      @Override
      public MapCodec<ddx> a() {
         return w;
      }

      @Override
      public yu<wh, ddx> b() {
         return x;
      }

      private static ddx a(wh $$0) {
         String $$1 = $$0.p();
         dcw $$2 = $$0.b(dcw.class);
         ddy $$3 = ddy.c.decode($$0);
         cys $$4 = cys.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new ddx($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wh $$0, ddx $$1) {
         $$0.a($$1.e);
         $$0.a($$1.f);
         ddy.c.encode($$0, $$1.c);
         cys.i.encode($$0, $$1.d);
         $$0.a($$1.g);
      }
   }
}
