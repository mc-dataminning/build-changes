import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfp implements deq {
   final dfq d;
   final dak e;
   final String f;
   final deo g;
   final boolean h;
   @Nullable
   private dfa i;

   public dfp(String $$0, deo $$1, dfq $$2, dak $$3, boolean $$4) {
      this.f = $$0;
      this.g = $$1;
      this.d = $$2;
      this.e = $$3;
      this.h = $$4;
   }

   public dfp(String $$0, deo $$1, dfq $$2, dak $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public dfl<? extends dfp> a() {
      return dfl.a;
   }

   @Override
   public String j() {
      return this.f;
   }

   @Override
   public deo c() {
      return this.g;
   }

   @VisibleForTesting
   public List<Optional<dex>> f() {
      return this.d.c();
   }

   @Override
   public dfa aq_() {
      if (this.i == null) {
         this.i = dfa.a(this.d.c());
      }

      return this.i;
   }

   @Override
   public boolean i() {
      return this.h;
   }

   public boolean a(dep $$0, dkj $$1) {
      return this.d.a($$0);
   }

   public dak a(dep $$0, ji.a $$1) {
      return this.e.v();
   }

   public int k() {
      return this.d.a();
   }

   public int l() {
      return this.d.b();
   }

   @Override
   public List<dgh> g() {
      return List.of(
         new dgl(this.d.a(), this.d.b(), this.d.c().stream().map($$0 -> $$0.<dgn>map(dex::c).orElse(dgn.c.c)).toList(), new dgn.f(this.e), new dgn.d(dao.fi))
      );
   }

   public static class a implements dfl<dfp> {
      public static final MapCodec<dfp> w = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.f),
                  deo.e.fieldOf("category").orElse(deo.d).forGetter($$0x -> $$0x.g),
                  dfq.b.forGetter($$0x -> $$0x.d),
                  dak.d.fieldOf("result").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, dfp::new)
      );
      public static final ze<wp, dfp> x = ze.a(dfp.a::a, dfp.a::a);

      @Override
      public MapCodec<dfp> a() {
         return w;
      }

      @Override
      public ze<wp, dfp> b() {
         return x;
      }

      private static dfp a(wp $$0) {
         String $$1 = $$0.p();
         deo $$2 = $$0.b(deo.class);
         dfq $$3 = dfq.c.decode($$0);
         dak $$4 = dak.j.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new dfp($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wp $$0, dfp $$1) {
         $$0.a($$1.f);
         $$0.a($$1.g);
         dfq.c.encode($$0, $$1.d);
         dak.j.encode($$0, $$1.e);
         $$0.a($$1.h);
      }
   }
}
