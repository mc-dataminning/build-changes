import com.google.gson.JsonObject;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class cg extends cu<cg.a> {
   static final aer a = new aer("lightning_strike");

   @Override
   public aer a() {
      return a;
   }

   public cg.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      Optional<ba> $$3 = bo.a($$0, "lightning", $$2);
      Optional<ba> $$4 = bo.a($$0, "bystander", $$2);
      return new cg.a($$1, $$3, $$4);
   }

   public void a(akl $$0, bix $$1, List<bii> $$2) {
      List<ecg> $$3 = $$2.stream().map($$1x -> bo.b($$0, $$1x)).collect(Collectors.toList());
      ecg $$4 = bo.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$4, $$3));
   }

   public static class a extends ar {
      private final Optional<ba> a;
      private final Optional<ba> b;

      public a(Optional<ba> $$0, Optional<ba> $$1, Optional<ba> $$2) {
         super(cg.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static cg.a a(Optional<bo> $$0, Optional<bo> $$1) {
         return new cg.a(Optional.empty(), bo.a($$0), bo.a($$1));
      }

      public boolean a(ecg $$0, List<ecg> $$1) {
         return this.a.isPresent() && !this.a.get().a($$0) ? false : !this.b.isPresent() || !$$1.stream().noneMatch(this.b.get()::a);
      }

      @Override
      public JsonObject b() {
         JsonObject $$0 = super.b();
         this.a.ifPresent($$1 -> $$0.add("lightning", $$1.a()));
         this.b.ifPresent($$1 -> $$0.add("bystander", $$1.a()));
         return $$0;
      }
   }
}
