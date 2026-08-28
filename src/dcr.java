import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcr implements dbs {
   final dcs c;
   final cxo d;
   final String e;
   final dbq f;
   final boolean g;
   @Nullable
   private dcc h;

   public dcr(String $$0, dbq $$1, dcs $$2, cxo $$3, boolean $$4) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
      this.g = $$4;
   }

   public dcr(String $$0, dbq $$1, dcs $$2, cxo $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public dcn<? extends dcr> a() {
      return dcn.a;
   }

   @Override
   public String j() {
      return this.e;
   }

   @Override
   public dbq c() {
      return this.f;
   }

   @VisibleForTesting
   public List<Optional<dbz>> f() {
      return this.c.c();
   }

   @Override
   public dcc ap_() {
      if (this.h == null) {
         this.h = dcc.a(this.c.c());
      }

      return this.h;
   }

   @Override
   public boolean i() {
      return this.g;
   }

   public boolean a(dbr $$0, dhh $$1) {
      return this.c.a($$0);
   }

   public cxo a(dbr $$0, js.a $$1) {
      return this.d.v();
   }

   public int k() {
      return this.c.a();
   }

   public int l() {
      return this.c.b();
   }

   @Override
   public List<ddi> g() {
      return List.of(
         new ddm(this.c.a(), this.c.b(), this.c.c().stream().map($$0 -> $$0.<ddo>map(dbz::b).orElse(ddo.c.c)).toList(), new ddo.f(this.d), new ddo.d(cxs.fa))
      );
   }

   public static class a implements dcn<dcr> {
      public static final MapCodec<dcr> w = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.e),
                  dbq.e.fieldOf("category").orElse(dbq.d).forGetter($$0x -> $$0x.f),
                  dcs.b.forGetter($$0x -> $$0x.c),
                  cxo.c.fieldOf("result").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dcr::new)
      );
      public static final zt<xg, dcr> x = zt.a(dcr.a::a, dcr.a::a);

      @Override
      public MapCodec<dcr> a() {
         return w;
      }

      @Override
      public zt<xg, dcr> b() {
         return x;
      }

      private static dcr a(xg $$0) {
         String $$1 = $$0.p();
         dbq $$2 = $$0.b(dbq.class);
         dcs $$3 = dcs.c.decode($$0);
         cxo $$4 = cxo.h.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new dcr($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(xg $$0, dcr $$1) {
         $$0.a($$1.e);
         $$0.a($$1.f);
         dcs.c.encode($$0, $$1.c);
         cxo.h.encode($$0, $$1.d);
         $$0.a($$1.g);
      }
   }
}
