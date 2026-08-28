import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dff implements deg {
   final dfg d;
   final daa e;
   final String f;
   final dee g;
   final boolean h;
   @Nullable
   private deq i;

   public dff(String $$0, dee $$1, dfg $$2, daa $$3, boolean $$4) {
      this.f = $$0;
      this.g = $$1;
      this.d = $$2;
      this.e = $$3;
      this.h = $$4;
   }

   public dff(String $$0, dee $$1, dfg $$2, daa $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public dfb<? extends dff> a() {
      return dfb.a;
   }

   @Override
   public String j() {
      return this.f;
   }

   @Override
   public dee c() {
      return this.g;
   }

   @VisibleForTesting
   public List<Optional<den>> f() {
      return this.d.c();
   }

   @Override
   public deq ap_() {
      if (this.i == null) {
         this.i = deq.a(this.d.c());
      }

      return this.i;
   }

   @Override
   public boolean i() {
      return this.h;
   }

   public boolean a(def $$0, djz $$1) {
      return this.d.a($$0);
   }

   public daa a(def $$0, ji.a $$1) {
      return this.e.v();
   }

   public int k() {
      return this.d.a();
   }

   public int l() {
      return this.d.b();
   }

   @Override
   public List<dfx> g() {
      return List.of(
         new dgb(this.d.a(), this.d.b(), this.d.c().stream().map($$0 -> $$0.<dgd>map(den::c).orElse(dgd.c.c)).toList(), new dgd.f(this.e), new dgd.d(dae.fi))
      );
   }

   public static class a implements dfb<dff> {
      public static final MapCodec<dff> w = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.f),
                  dee.e.fieldOf("category").orElse(dee.d).forGetter($$0x -> $$0x.g),
                  dfg.b.forGetter($$0x -> $$0x.d),
                  daa.d.fieldOf("result").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, dff::new)
      );
      public static final za<wn, dff> x = za.a(dff.a::a, dff.a::a);

      @Override
      public MapCodec<dff> a() {
         return w;
      }

      @Override
      public za<wn, dff> b() {
         return x;
      }

      private static dff a(wn $$0) {
         String $$1 = $$0.p();
         dee $$2 = $$0.b(dee.class);
         dfg $$3 = dfg.c.decode($$0);
         daa $$4 = daa.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new dff($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wn $$0, dff $$1) {
         $$0.a($$1.f);
         $$0.a($$1.g);
         dfg.c.encode($$0, $$1.d);
         daa.i.encode($$0, $$1.e);
         $$0.a($$1.h);
      }
   }
}
