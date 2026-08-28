import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class fte implements ftc {
   private final dne a;
   private final List<fte.a> b = new ArrayList<>();

   private fte(dne $$0) {
      this.a = $$0;
   }

   @Override
   public dne a() {
      return this.a;
   }

   public static fte a(dne $$0) {
      return new fte($$0);
   }

   public fte a(ftb $$0) {
      this.b.add(new fte.a(Optional.empty(), $$0));
      return this;
   }

   private void a(guc $$0) {
      $$0.instantiate(this.a.l());
   }

   public fte a(guc $$0, ftb $$1) {
      this.a($$0);
      this.b.add(new fte.a(Optional.of($$0), $$1));
      return this;
   }

   public fte a(ftd $$0, ftb $$1) {
      return this.a($$0.a(), $$1);
   }

   @Override
   public gtn b() {
      return new gtn(Optional.empty(), Optional.of(new gtn.a(this.b.stream().map(fte.a::a).toList())));
   }

   static record a(Optional<guc> a, ftb b) {
      public guf a() {
         return new guf(this.a, this.b.a());
      }

      public Optional<guc> b() {
         return this.a;
      }

      public ftb c() {
         return this.b;
      }
   }
}
