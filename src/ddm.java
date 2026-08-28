import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record ddm(List<ddm.a> e) implements dcq, ddp {
   public static final ddm a = new ddm(List.of());
   public static final int b = 160;
   public static final Codec<ddm> c = ddm.a.a.listOf().xmap(ddm::new, ddm::a);
   public static final ze<wp, ddm> d = ddm.a.b.a(zc.a()).a(ddm::new, ddm::a);

   public ddm a(ddm.a $$0) {
      return new ddm(ag.a(this.e, $$0));
   }

   @Override
   public void a(dkj $$0, byf $$1, dak $$2, dcp $$3) {
      for (ddm.a $$4 : this.e) {
         $$1.a($$4.a());
      }
   }

   @Override
   public void a(dag.b $$0, Consumer<xg> $$1, dbz $$2, kg $$3) {
      if ($$2.b()) {
         List<bwi> $$4 = new ArrayList<>();

         for (ddm.a $$5 : this.e) {
            $$4.add($$5.a());
         }

         dcg.a($$4, $$1, 1.0F, $$0.b());
      }
   }

   public List<ddm.a> a() {
      return this.e;
   }

   public static record a(jg<bwg> c, int d) {
      public static final Codec<ddm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bwg.a.fieldOf("id").forGetter(ddm.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(ddm.a::c))
               .apply($$0, ddm.a::new)
      );
      public static final ze<wp, ddm.a> b = ze.a(bwg.b, ddm.a::b, zc.h, ddm.a::c, ddm.a::new);

      public bwi a() {
         return new bwi(this.c, this.d);
      }

      public jg<bwg> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
