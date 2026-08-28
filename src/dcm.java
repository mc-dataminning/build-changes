import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcm implements dbp {
   final dcn c;
   final cxk d;
   final String e;
   final dbn f;
   final boolean g;
   @Nullable
   private dby h;

   public dcm(String $$0, dbn $$1, dcn $$2, cxk $$3, boolean $$4) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
      this.g = $$4;
   }

   public dcm(String $$0, dbn $$1, dcn $$2, cxk $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public dci<? extends dcm> a() {
      return dci.a;
   }

   @Override
   public String j() {
      return this.e;
   }

   @Override
   public dbn c() {
      return this.f;
   }

   @VisibleForTesting
   public List<Optional<dbv>> f() {
      return this.c.c();
   }

   @Override
   public dby ap_() {
      if (this.h == null) {
         this.h = dby.a(this.c.c());
      }

      return this.h;
   }

   @Override
   public boolean i() {
      return this.g;
   }

   public boolean a(dbo $$0, dha $$1) {
      return this.c.a($$0);
   }

   public cxk a(dbo $$0, js.a $$1) {
      return this.d.v();
   }

   public int k() {
      return this.c.a();
   }

   public int l() {
      return this.c.b();
   }

   @Override
   public List<ddc> g() {
      return List.of(
         new ddg(this.c.a(), this.c.b(), this.c.c().stream().map($$0 -> $$0.<ddi>map(dbv::b).orElse(ddi.c.c)).toList(), new ddi.e(this.d), new ddi.d(cxo.fa))
      );
   }

   public static class a implements dci<dcm> {
      public static final MapCodec<dcm> w = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.e),
                  dbn.e.fieldOf("category").orElse(dbn.d).forGetter($$0x -> $$0x.f),
                  dcn.b.forGetter($$0x -> $$0x.c),
                  cxk.d.fieldOf("result").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dcm::new)
      );
      public static final zt<xg, dcm> x = zt.a(dcm.a::a, dcm.a::a);

      @Override
      public MapCodec<dcm> a() {
         return w;
      }

      @Override
      public zt<xg, dcm> b() {
         return x;
      }

      private static dcm a(xg $$0) {
         String $$1 = $$0.p();
         dbn $$2 = $$0.b(dbn.class);
         dcn $$3 = dcn.c.decode($$0);
         cxk $$4 = cxk.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new dcm($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(xg $$0, dcm $$1) {
         $$0.a($$1.e);
         $$0.a($$1.f);
         dcn.c.encode($$0, $$1.c);
         cxk.i.encode($$0, $$1.d);
         $$0.a($$1.g);
      }
   }
}
