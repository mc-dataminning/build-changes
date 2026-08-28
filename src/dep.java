import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dep implements ddq {
   final deq d;
   final czk e;
   final String f;
   final ddo g;
   final boolean h;
   @Nullable
   private dea i;

   public dep(String $$0, ddo $$1, deq $$2, czk $$3, boolean $$4) {
      this.f = $$0;
      this.g = $$1;
      this.d = $$2;
      this.e = $$3;
      this.h = $$4;
   }

   public dep(String $$0, ddo $$1, deq $$2, czk $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public del<? extends dep> a() {
      return del.a;
   }

   @Override
   public String j() {
      return this.f;
   }

   @Override
   public ddo c() {
      return this.g;
   }

   @VisibleForTesting
   public List<Optional<ddx>> f() {
      return this.d.c();
   }

   @Override
   public dea al_() {
      if (this.i == null) {
         this.i = dea.a(this.d.c());
      }

      return this.i;
   }

   @Override
   public boolean i() {
      return this.h;
   }

   public boolean a(ddp $$0, djh $$1) {
      return this.d.a($$0);
   }

   public czk a(ddp $$0, jh.a $$1) {
      return this.e.v();
   }

   public int k() {
      return this.d.a();
   }

   public int l() {
      return this.d.b();
   }

   @Override
   public List<dfh> g() {
      return List.of(
         new dfl(this.d.a(), this.d.b(), this.d.c().stream().map($$0 -> $$0.<dfn>map(ddx::c).orElse(dfn.c.c)).toList(), new dfn.f(this.e), new dfn.d(czo.fi))
      );
   }

   public static class a implements del<dep> {
      public static final MapCodec<dep> w = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.f),
                  ddo.e.fieldOf("category").orElse(ddo.d).forGetter($$0x -> $$0x.g),
                  deq.b.forGetter($$0x -> $$0x.d),
                  czk.d.fieldOf("result").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, dep::new)
      );
      public static final yw<wj, dep> x = yw.a(dep.a::a, dep.a::a);

      @Override
      public MapCodec<dep> a() {
         return w;
      }

      @Override
      public yw<wj, dep> b() {
         return x;
      }

      private static dep a(wj $$0) {
         String $$1 = $$0.p();
         ddo $$2 = $$0.b(ddo.class);
         deq $$3 = deq.c.decode($$0);
         czk $$4 = czk.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new dep($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wj $$0, dep $$1) {
         $$0.a($$1.f);
         $$0.a($$1.g);
         deq.c.encode($$0, $$1.d);
         czk.i.encode($$0, $$1.e);
         $$0.a($$1.h);
      }
   }
}
