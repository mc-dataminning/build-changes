import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfd implements dee {
   final dfe d;
   final czy e;
   final String f;
   final dec g;
   final boolean h;
   @Nullable
   private deo i;

   public dfd(String $$0, dec $$1, dfe $$2, czy $$3, boolean $$4) {
      this.f = $$0;
      this.g = $$1;
      this.d = $$2;
      this.e = $$3;
      this.h = $$4;
   }

   public dfd(String $$0, dec $$1, dfe $$2, czy $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public dez<? extends dfd> a() {
      return dez.a;
   }

   @Override
   public String j() {
      return this.f;
   }

   @Override
   public dec c() {
      return this.g;
   }

   @VisibleForTesting
   public List<Optional<del>> f() {
      return this.d.c();
   }

   @Override
   public deo ap_() {
      if (this.i == null) {
         this.i = deo.a(this.d.c());
      }

      return this.i;
   }

   @Override
   public boolean i() {
      return this.h;
   }

   public boolean a(ded $$0, djx $$1) {
      return this.d.a($$0);
   }

   public czy a(ded $$0, jh.a $$1) {
      return this.e.v();
   }

   public int k() {
      return this.d.a();
   }

   public int l() {
      return this.d.b();
   }

   @Override
   public List<dfv> g() {
      return List.of(
         new dfz(this.d.a(), this.d.b(), this.d.c().stream().map($$0 -> $$0.<dgb>map(del::c).orElse(dgb.c.c)).toList(), new dgb.f(this.e), new dgb.d(dac.fi))
      );
   }

   public static class a implements dez<dfd> {
      public static final MapCodec<dfd> w = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.f),
                  dec.e.fieldOf("category").orElse(dec.d).forGetter($$0x -> $$0x.g),
                  dfe.b.forGetter($$0x -> $$0x.d),
                  czy.d.fieldOf("result").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, dfd::new)
      );
      public static final yy<wl, dfd> x = yy.a(dfd.a::a, dfd.a::a);

      @Override
      public MapCodec<dfd> a() {
         return w;
      }

      @Override
      public yy<wl, dfd> b() {
         return x;
      }

      private static dfd a(wl $$0) {
         String $$1 = $$0.p();
         dec $$2 = $$0.b(dec.class);
         dfe $$3 = dfe.c.decode($$0);
         czy $$4 = czy.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new dfd($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wl $$0, dfd $$1) {
         $$0.a($$1.f);
         $$0.a($$1.g);
         dfe.c.encode($$0, $$1.d);
         czy.i.encode($$0, $$1.e);
         $$0.a($$1.h);
      }
   }
}
