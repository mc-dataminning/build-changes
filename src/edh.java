import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.function.Consumer;

public class edh extends ede {
   final apy<cir> i;
   final boolean j;

   edh(apy<cir> $$0, boolean $$1, int $$2, int $$3, efh[] $$4, edw[] $$5) {
      super($$2, $$3, $$4, $$5);
      this.i = $$0;
      this.j = $$1;
   }

   @Override
   public edd a() {
      return eda.e;
   }

   @Override
   public void a(Consumer<ciw> $$0, ech $$1) {
      jc.i.c(this.i).forEach($$1x -> $$0.accept(new ciw($$1x)));
   }

   private boolean a(ech $$0, Consumer<edb> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final hf<cir> $$2 : jc.i.c(this.i)) {
            $$1.accept(new ede.c() {
               @Override
               public void a(Consumer<ciw> $$0, ech $$1) {
                  $$0.accept(new ciw($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(ech $$0, Consumer<edb> $$1) {
      return this.j ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static ede.a<?> a(apy<cir> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new edh($$0, false, $$1, $$2, $$3, $$4));
   }

   public static ede.a<?> b(apy<cir> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new edh($$0, true, $$1, $$2, $$3, $$4));
   }

   public static class a extends ede.e<edh> {
      public void a(JsonObject $$0, edh $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("name", $$1.i.b().toString());
         $$0.addProperty("expand", $$1.j);
      }

      protected edh a(JsonObject $$0, JsonDeserializationContext $$1, int $$2, int $$3, efh[] $$4, edw[] $$5) {
         aep $$6 = new aep(arf.i($$0, "name"));
         apy<cir> $$7 = apy.a(jd.D, $$6);
         boolean $$8 = arf.k($$0, "expand");
         return new edh($$7, $$8, $$2, $$3, $$4, $$5);
      }
   }
}
