import com.google.common.collect.Maps;
import java.util.Map;

public final class cpf {
   public static final cpf a = a("desert");
   public static final cpf b = a("jungle");
   public static final cpf c = a("plains");
   public static final cpf d = a("savanna");
   public static final cpf e = a("snow");
   public static final cpf f = a("swamp");
   public static final cpf g = a("taiga");
   private final String h;
   private static final Map<alo<dib>, cpf> i = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dii.B, a);
      $$0.put(dii.f, a);
      $$0.put(dii.C, a);
      $$0.put(dii.D, a);
      $$0.put(dii.A, b);
      $$0.put(dii.y, b);
      $$0.put(dii.z, b);
      $$0.put(dii.t, d);
      $$0.put(dii.s, d);
      $$0.put(dii.x, d);
      $$0.put(dii.Y, e);
      $$0.put(dii.X, e);
      $$0.put(dii.M, e);
      $$0.put(dii.e, e);
      $$0.put(dii.O, e);
      $$0.put(dii.r, e);
      $$0.put(dii.d, e);
      $$0.put(dii.G, e);
      $$0.put(dii.H, e);
      $$0.put(dii.I, e);
      $$0.put(dii.J, e);
      $$0.put(dii.g, f);
      $$0.put(dii.h, f);
      $$0.put(dii.p, g);
      $$0.put(dii.o, g);
      $$0.put(dii.v, g);
      $$0.put(dii.u, g);
      $$0.put(dii.q, g);
      $$0.put(dii.w, g);
   });

   private cpf(String $$0) {
      this.h = $$0;
   }

   @Override
   public String toString() {
      return this.h;
   }

   private static cpf a(String $$0) {
      return kd.a(ma.w, alp.b($$0), new cpf($$0));
   }

   public static cpf a(jq<dib> $$0) {
      return $$0.e().map(i::get).orElse(c);
   }
}
