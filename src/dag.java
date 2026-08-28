import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record dag(List<dag.a> e) implements czm, dai {
   public static final dag a = new dag(List.of());
   public static final int b = 160;
   public static final Codec<dag> c = dag.a.a.listOf().xmap(dag::new, dag::a);
   public static final yn<wa, dag> d = dag.a.b.a(yl.a()).a(dag::new, dag::a);

   public dag a(dag.a $$0) {
      return new dag(af.a(this.e, $$0));
   }

   @Override
   public void a(dgz $$0, bvy $$1, cxh $$2, czl $$3) {
      for (dag.a $$4 : this.e) {
         $$1.a($$4.a());
      }
   }

   @Override
   public void a(cxd.b $$0, Consumer<wp> $$1, cyx $$2) {
      if ($$2.b()) {
         List<bue> $$3 = new ArrayList<>();

         for (dag.a $$4 : this.e) {
            $$3.add($$4.a());
         }

         cze.a($$3, $$1, 1.0F, $$0.b());
      }
   }

   public List<dag.a> a() {
      return this.e;
   }

   public static record a(jr<buc> c, int d) {
      public static final Codec<dag.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(buc.a.fieldOf("id").forGetter(dag.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(dag.a::c))
               .apply($$0, dag.a::new)
      );
      public static final yn<wa, dag.a> b = yn.a(buc.b, dag.a::b, yl.h, dag.a::c, dag.a::new);

      public bue a() {
         return new bue(this.c, this.d);
      }

      public jr<buc> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
