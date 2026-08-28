import java.util.Map;

public record die(int a, Map<dig, Integer> b, int c, jg<awq> d, float e, float f, axv<czw> g, alj<dih> h) {
   public dcr a(dig $$0) {
      int $$1 = this.b.getOrDefault($$0, 0);
      dcr.a $$2 = dcr.a();
      bxg $$3 = bxg.a($$0.a());
      alk $$4 = alk.b("armor." + $$0.b());
      $$2.a(bzc.a, new bza($$4, (double)$$1, bza.a.a), $$3);
      $$2.a(bzc.b, new bza($$4, (double)this.e, bza.a.a), $$3);
      if (this.f > 0.0F) {
         $$2.a(bzc.p, new bza($$4, (double)this.f, bza.a.a), $$3);
      }

      return $$2.a();
   }
}
