import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dei implements ddj {
   final dej c;
   final czd d;
   final String e;
   final ddh f;
   final boolean g;
   @Nullable
   private ddt h;

   public dei(String $$0, ddh $$1, dej $$2, czd $$3, boolean $$4) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
      this.g = $$4;
   }

   public dei(String $$0, ddh $$1, dej $$2, czd $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public dee<? extends dei> a() {
      return dee.a;
   }

   @Override
   public String j() {
      return this.e;
   }

   @Override
   public ddh c() {
      return this.f;
   }

   @VisibleForTesting
   public List<Optional<ddq>> f() {
      return this.c.c();
   }

   @Override
   public ddt al_() {
      if (this.h == null) {
         this.h = ddt.a(this.c.c());
      }

      return this.h;
   }

   @Override
   public boolean i() {
      return this.g;
   }

   public boolean a(ddi $$0, dja $$1) {
      return this.c.a($$0);
   }

   public czd a(ddi $$0, jg.a $$1) {
      return this.d.v();
   }

   public int k() {
      return this.c.a();
   }

   public int l() {
      return this.c.b();
   }

   @Override
   public List<dfa> g() {
      return List.of(
         new dfe(this.c.a(), this.c.b(), this.c.c().stream().map($$0 -> $$0.<dfg>map(ddq::c).orElse(dfg.c.c)).toList(), new dfg.f(this.d), new dfg.d(czh.fi))
      );
   }

   public static class a implements dee<dei> {
      public static final MapCodec<dei> w = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.e),
                  ddh.e.fieldOf("category").orElse(ddh.d).forGetter($$0x -> $$0x.f),
                  dej.b.forGetter($$0x -> $$0x.c),
                  czd.d.fieldOf("result").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dei::new)
      );
      public static final yw<wj, dei> x = yw.a(dei.a::a, dei.a::a);

      @Override
      public MapCodec<dei> a() {
         return w;
      }

      @Override
      public yw<wj, dei> b() {
         return x;
      }

      private static dei a(wj $$0) {
         String $$1 = $$0.p();
         ddh $$2 = $$0.b(ddh.class);
         dej $$3 = dej.c.decode($$0);
         czd $$4 = czd.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new dei($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wj $$0, dei $$1) {
         $$0.a($$1.e);
         $$0.a($$1.f);
         dej.c.encode($$0, $$1.c);
         czd.i.encode($$0, $$1.d);
         $$0.a($$1.g);
      }
   }
}
