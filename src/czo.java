import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record czo(List<czo.a> e) implements cyu, czq {
   public static final czo a = new czo(List.of());
   public static final int b = 160;
   public static final Codec<czo> c = czo.a.a.listOf().xmap(czo::new, czo::a);
   public static final ym<vz, czo> d = czo.a.b.a(yk.a()).a(czo::new, czo::a);

   public czo a(czo.a $$0) {
      return new czo(af.a(this.e, $$0));
   }

   @Override
   public void a(dgg $$0, bvf $$1, cwn $$2, cyt $$3) {
      for (czo.a $$4 : this.e) {
         $$1.a($$4.a());
      }
   }

   @Override
   public void a(cwj.b $$0, Consumer<wo> $$1, cyf $$2) {
      if ($$2.b()) {
         List<bto> $$3 = new ArrayList<>();

         for (czo.a $$4 : this.e) {
            $$3.add($$4.a());
         }

         cym.a($$3, $$1, 1.0F, $$0.b());
      }
   }

   public List<czo.a> a() {
      return this.e;
   }

   public static record a(jr<btm> c, int d) {
      public static final Codec<czo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(btm.a.fieldOf("id").forGetter(czo.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(czo.a::c))
               .apply($$0, czo.a::new)
      );
      public static final ym<vz, czo.a> b = ym.a(btm.b, czo.a::b, yk.h, czo.a::c, czo.a::new);

      public bto a() {
         return new bto(this.c, this.d);
      }

      public jr<btm> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
