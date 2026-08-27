import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edz extends eds {
   private static final Codec<Pair<he<dcc>, chl>> b = Codec.mapPair(jb.al.r().fieldOf("pattern"), chl.q.fieldOf("color")).codec();
   public static final Codec<edz> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(b.listOf().fieldOf("patterns").forGetter($$0x -> $$0x.c), Codec.BOOL.fieldOf("append").forGetter($$0x -> $$0x.d)))
            .apply($$0, edz::new)
   );
   private final List<Pair<he<dcc>, chl>> c;
   private final boolean d;

   edz(List<eff> $$0, List<Pair<he<dcc>, chl>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected cix a(cix $$0, ecg $$1) {
      qr $$2 = cgq.a($$0);
      if ($$2 == null) {
         $$2 = new qr();
      }

      dcc.a $$3 = new dcc.a();
      this.c.forEach($$3::a);
      qx $$4 = $$3.a();
      qx $$5;
      if (this.d) {
         $$5 = $$2.c("Patterns", 10).e();
         $$5.addAll($$4);
      } else {
         $$5 = $$4;
      }

      $$2.a("Patterns", $$5);
      cgq.a($$0, dcn.t, $$2);
      return $$0;
   }

   @Override
   public edu b() {
      return edv.y;
   }

   public static edz.a a(boolean $$0) {
      return new edz.a($$0);
   }

   public static class a extends eds.a<edz.a> {
      private final Builder<Pair<he<dcc>, chl>> a = ImmutableList.builder();
      private final boolean b;

      a(boolean $$0) {
         this.b = $$0;
      }

      protected edz.a a() {
         return this;
      }

      @Override
      public edt b() {
         return new edz(this.g(), this.a.build(), this.b);
      }

      public edz.a a(aeq<dcc> $$0, chl $$1) {
         return this.a(jb.al.f($$0), $$1);
      }

      public edz.a a(he<dcc> $$0, chl $$1) {
         this.a.add(Pair.of($$0, $$1));
         return this;
      }
   }
}
