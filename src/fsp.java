import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class fsp implements fsn {
   private final dno a;
   private final List<fsp.a> b = new ArrayList<>();

   private fsp(dno $$0) {
      this.a = $$0;
   }

   @Override
   public dno a() {
      return this.a;
   }

   public static fsp a(dno $$0) {
      return new fsp($$0);
   }

   public fsp a(fsm $$0) {
      this.b.add(new fsp.a(Optional.empty(), $$0));
      return this;
   }

   private void a(gtn $$0) {
      $$0.instantiate(this.a.l());
   }

   public fsp a(gtn $$0, fsm $$1) {
      this.a($$0);
      this.b.add(new fsp.a(Optional.of($$0), $$1));
      return this;
   }

   public fsp a(fso $$0, fsm $$1) {
      return this.a($$0.a(), $$1);
   }

   @Override
   public gsy b() {
      return new gsy(Optional.empty(), Optional.of(new gsy.a(this.b.stream().map(fsp.a::a).toList())));
   }

   static record a(Optional<gtn> a, fsm b) {
      public gtq a() {
         return new gtq(this.a, this.b.a());
      }

      public Optional<gtn> b() {
         return this.a;
      }

      public fsm c() {
         return this.b;
      }
   }
}
