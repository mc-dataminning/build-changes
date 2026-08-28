import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record dal(List<dal.a> e) implements czr, dan {
   public static final dal a = new dal(List.of());
   public static final int b = 160;
   public static final Codec<dal> c = dal.a.a.listOf().xmap(dal::new, dal::a);
   public static final zt<xg, dal> d = dal.a.b.a(zr.a()).a(dal::new, dal::a);

   public dal a(dal.a $$0) {
      return new dal(ae.a(this.e, $$0));
   }

   @Override
   public void a(dha $$0, bwb $$1, cxk $$2, czq $$3) {
      for (dal.a $$4 : this.e) {
         $$1.a($$4.a());
      }
   }

   @Override
   public void a(cxg.b $$0, Consumer<xv> $$1, czc $$2) {
      if ($$2.b()) {
         List<buk> $$3 = new ArrayList<>();

         for (dal.a $$4 : this.e) {
            $$3.add($$4.a());
         }

         czj.a($$3, $$1, 1.0F, $$0.b());
      }
   }

   public List<dal.a> a() {
      return this.e;
   }

   public static record a(jq<bui> c, int d) {
      public static final Codec<dal.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bui.a.fieldOf("id").forGetter(dal.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(dal.a::c))
               .apply($$0, dal.a::new)
      );
      public static final zt<xg, dal.a> b = zt.a(bui.b, dal.a::b, zr.h, dal.a::c, dal.a::new);

      public buk a() {
         return new buk(this.c, this.d);
      }

      public jq<bui> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
