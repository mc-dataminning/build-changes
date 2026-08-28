import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ftc implements fta {
   private final dnc a;
   private final List<ftc.a> b = new ArrayList<>();

   private ftc(dnc $$0) {
      this.a = $$0;
   }

   @Override
   public dnc a() {
      return this.a;
   }

   public static ftc a(dnc $$0) {
      return new ftc($$0);
   }

   public ftc a(fsz $$0) {
      this.b.add(new ftc.a(Optional.empty(), $$0));
      return this;
   }

   private void a(gua $$0) {
      $$0.instantiate(this.a.l());
   }

   public ftc a(gua $$0, fsz $$1) {
      this.a($$0);
      this.b.add(new ftc.a(Optional.of($$0), $$1));
      return this;
   }

   public ftc a(ftb $$0, fsz $$1) {
      return this.a($$0.a(), $$1);
   }

   @Override
   public gtl b() {
      return new gtl(Optional.empty(), Optional.of(new gtl.a(this.b.stream().map(ftc.a::a).toList())));
   }

   static record a(Optional<gua> a, fsz b) {
      public gud a() {
         return new gud(this.a, this.b.a());
      }

      public Optional<gua> b() {
         return this.a;
      }

      public fsz c() {
         return this.b;
      }
   }
}
