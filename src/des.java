import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class des implements ddt {
   final det d;
   final czn e;
   final String f;
   final ddr g;
   final boolean h;
   @Nullable
   private ded i;

   public des(String $$0, ddr $$1, det $$2, czn $$3, boolean $$4) {
      this.f = $$0;
      this.g = $$1;
      this.d = $$2;
      this.e = $$3;
      this.h = $$4;
   }

   public des(String $$0, ddr $$1, det $$2, czn $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public deo<? extends des> a() {
      return deo.a;
   }

   @Override
   public String j() {
      return this.f;
   }

   @Override
   public ddr c() {
      return this.g;
   }

   @VisibleForTesting
   public List<Optional<dea>> f() {
      return this.d.c();
   }

   @Override
   public ded al_() {
      if (this.i == null) {
         this.i = ded.a(this.d.c());
      }

      return this.i;
   }

   @Override
   public boolean i() {
      return this.h;
   }

   public boolean a(dds $$0, djm $$1) {
      return this.d.a($$0);
   }

   public czn a(dds $$0, jh.a $$1) {
      return this.e.v();
   }

   public int k() {
      return this.d.a();
   }

   public int l() {
      return this.d.b();
   }

   @Override
   public List<dfk> g() {
      return List.of(
         new dfo(this.d.a(), this.d.b(), this.d.c().stream().map($$0 -> $$0.<dfq>map(dea::c).orElse(dfq.c.c)).toList(), new dfq.f(this.e), new dfq.d(czr.fi))
      );
   }

   public static class a implements deo<des> {
      public static final MapCodec<des> w = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.f),
                  ddr.e.fieldOf("category").orElse(ddr.d).forGetter($$0x -> $$0x.g),
                  det.b.forGetter($$0x -> $$0x.d),
                  czn.d.fieldOf("result").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, des::new)
      );
      public static final yw<wj, des> x = yw.a(des.a::a, des.a::a);

      @Override
      public MapCodec<des> a() {
         return w;
      }

      @Override
      public yw<wj, des> b() {
         return x;
      }

      private static des a(wj $$0) {
         String $$1 = $$0.p();
         ddr $$2 = $$0.b(ddr.class);
         det $$3 = det.c.decode($$0);
         czn $$4 = czn.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new des($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wj $$0, des $$1) {
         $$0.a($$1.f);
         $$0.a($$1.g);
         det.c.encode($$0, $$1.d);
         czn.i.encode($$0, $$1.e);
         $$0.a($$1.h);
      }
   }
}
