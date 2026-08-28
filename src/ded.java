import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ded implements dde {
   final dee c;
   final cyy d;
   final String e;
   final ddc f;
   final boolean g;
   @Nullable
   private ddo h;

   public ded(String $$0, ddc $$1, dee $$2, cyy $$3, boolean $$4) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
      this.g = $$4;
   }

   public ded(String $$0, ddc $$1, dee $$2, cyy $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public ddz<? extends ded> a() {
      return ddz.a;
   }

   @Override
   public String j() {
      return this.e;
   }

   @Override
   public ddc c() {
      return this.f;
   }

   @VisibleForTesting
   public List<Optional<ddl>> f() {
      return this.c.c();
   }

   @Override
   public ddo ak_() {
      if (this.h == null) {
         this.h = ddo.a(this.c.c());
      }

      return this.h;
   }

   @Override
   public boolean i() {
      return this.g;
   }

   public boolean a(ddd $$0, div $$1) {
      return this.c.a($$0);
   }

   public cyy a(ddd $$0, jg.a $$1) {
      return this.d.v();
   }

   public int k() {
      return this.c.a();
   }

   public int l() {
      return this.c.b();
   }

   @Override
   public List<dev> g() {
      return List.of(
         new dez(this.c.a(), this.c.b(), this.c.c().stream().map($$0 -> $$0.<dfb>map(ddl::c).orElse(dfb.c.c)).toList(), new dfb.f(this.d), new dfb.d(czc.fg))
      );
   }

   public static class a implements ddz<ded> {
      public static final MapCodec<ded> w = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.e),
                  ddc.e.fieldOf("category").orElse(ddc.d).forGetter($$0x -> $$0x.f),
                  dee.b.forGetter($$0x -> $$0x.c),
                  cyy.d.fieldOf("result").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.g)
               )
               .apply($$0, ded::new)
      );
      public static final yw<wj, ded> x = yw.a(ded.a::a, ded.a::a);

      @Override
      public MapCodec<ded> a() {
         return w;
      }

      @Override
      public yw<wj, ded> b() {
         return x;
      }

      private static ded a(wj $$0) {
         String $$1 = $$0.p();
         ddc $$2 = $$0.b(ddc.class);
         dee $$3 = dee.c.decode($$0);
         cyy $$4 = cyy.i.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new ded($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wj $$0, ded $$1) {
         $$0.a($$1.e);
         $$0.a($$1.f);
         dee.c.encode($$0, $$1.c);
         cyy.i.encode($$0, $$1.d);
         $$0.a($$1.g);
      }
   }
}
