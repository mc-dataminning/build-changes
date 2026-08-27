import com.google.gson.JsonObject;
import java.util.Optional;

public class cq extends cu<cq.a> {
   final aer a;

   public cq(aer $$0) {
      this.a = $$0;
   }

   @Override
   public aer a() {
      return this.a;
   }

   public cq.a a(JsonObject $$0, Optional<ba> $$1, be $$2) {
      return new cq.a(this.a, $$1);
   }

   public void a(akl $$0) {
      this.a($$0, $$0x -> true);
   }

   public static class a extends ar {
      public a(aer $$0, Optional<ba> $$1) {
         super($$0, $$1);
      }

      public static cq.a a(ch.a $$0) {
         return new cq.a(ai.p.a, bo.a(bo.a.a().a($$0)));
      }

      public static cq.a a(Optional<bo> $$0) {
         return new cq.a(ai.p.a, bo.a($$0));
      }

      public static cq.a d() {
         return new cq.a(ai.q.a, Optional.empty());
      }

      public static cq.a e() {
         return new cq.a(ai.H.a, Optional.empty());
      }

      public static cq.a f() {
         return new cq.a(ai.Y.a, Optional.empty());
      }

      public static cq.a g() {
         return new cq.a(ai.w.a, Optional.empty());
      }

      public static cq.a a(csl $$0, cis $$1) {
         return a(bo.a.a().a(bl.a.a().d(bz.a.a().a($$1))).b(ch.a.a().a(at.a.a().a($$0))).b());
      }
   }
}
