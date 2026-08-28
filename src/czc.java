import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record czc(List<czc.a> e) implements cyi, cze {
   public static final czc a = new czc(List.of());
   public static final int b = 160;
   public static final Codec<czc> c = czc.a.a.listOf().xmap(czc::new, czc::a);
   public static final zg<wt, czc> d = czc.a.b.a(ze.a()).a(czc::new, czc::a);

   public czc a(czc.a $$0) {
      return new czc(ae.a(this.e, $$0));
   }

   @Override
   public void a(dfb $$0, bva $$1, cwb $$2, cyh $$3) {
      for (czc.a $$4 : this.e) {
         $$1.a($$4.a());
      }
   }

   @Override
   public void a(cvx.b $$0, Consumer<xi> $$1, cxt $$2) {
      if ($$2.b()) {
         List<btj> $$3 = new ArrayList<>();

         for (czc.a $$4 : this.e) {
            $$3.add($$4.a());
         }

         cya.a($$3, $$1, 1.0F, $$0.b());
      }
   }

   public List<czc.a> a() {
      return this.e;
   }

   public static record a(jq<bth> c, int d) {
      public static final Codec<czc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bth.a.fieldOf("id").forGetter(czc.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(czc.a::c))
               .apply($$0, czc.a::new)
      );
      public static final zg<wt, czc.a> b = zg.a(bth.b, czc.a::b, ze.h, czc.a::c, czc.a::new);

      public btj a() {
         return new btj(this.c, this.d);
      }

      public jq<bth> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
