import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record czq(List<czq.a> e) implements cyw, czs {
   public static final czq a = new czq(List.of());
   public static final int b = 160;
   public static final Codec<czq> c = czq.a.a.listOf().xmap(czq::new, czq::a);
   public static final yn<wa, czq> d = czq.a.b.a(yl.a()).a(czq::new, czq::a);

   public czq a(czq.a $$0) {
      return new czq(af.a(this.e, $$0));
   }

   @Override
   public void a(dgi $$0, bvh $$1, cwp $$2, cyv $$3) {
      for (czq.a $$4 : this.e) {
         $$1.a($$4.a());
      }
   }

   @Override
   public void a(cwl.b $$0, Consumer<wp> $$1, cyh $$2) {
      if ($$2.b()) {
         List<btq> $$3 = new ArrayList<>();

         for (czq.a $$4 : this.e) {
            $$3.add($$4.a());
         }

         cyo.a($$3, $$1, 1.0F, $$0.b());
      }
   }

   public List<czq.a> a() {
      return this.e;
   }

   public static record a(jr<bto> c, int d) {
      public static final Codec<czq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bto.a.fieldOf("id").forGetter(czq.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(czq.a::c))
               .apply($$0, czq.a::new)
      );
      public static final yn<wa, czq.a> b = yn.a(bto.b, czq.a::b, yl.h, czq.a::c, czq.a::new);

      public btq a() {
         return new btq(this.c, this.d);
      }

      public jr<bto> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
