import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record cyu(List<cyu.a> e) implements cyc, cyw {
   public static final cyu a = new cyu(List.of());
   public static final int b = 160;
   public static final Codec<cyu> c = cyu.a.a.listOf().xmap(cyu::new, cyu::a);
   public static final zb<wo, cyu> d = cyu.a.b.a(yz.a()).a(cyu::new, cyu::a);

   public cyu a(cyu.a $$0) {
      return new cyu(ad.a(this.e, $$0));
   }

   @Override
   public void a(deg $$0, buk $$1, cvp $$2, cyb $$3) {
      for (cyu.a $$4 : this.e) {
         $$1.a($$4.a());
      }
   }

   @Override
   public void a(cvk.b $$0, Consumer<xd> $$1, cxh $$2) {
      if ($$2.b()) {
         List<bsv> $$3 = new ArrayList<>();

         for (cyu.a $$4 : this.e) {
            $$3.add($$4.a());
         }

         cxo.a($$3, $$1, 1.0F, $$0.b());
      }
   }

   public List<cyu.a> a() {
      return this.e;
   }

   public static record a(jn<bst> c, int d) {
      public static final Codec<cyu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bst.a.fieldOf("id").forGetter(cyu.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(cyu.a::c))
               .apply($$0, cyu.a::new)
      );
      public static final zb<wo, cyu.a> b = zb.a(bst.b, cyu.a::b, yz.g, cyu.a::c, cyu.a::new);

      public bsv a() {
         return new bsv(this.c, this.d);
      }

      public jn<bst> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
