import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record ead(String s, boolean t, boolean u, boolean v, ead.a w, dtn x, awk y, awk z, awk A, awk B, awk C, awk D, awk E, awk F) {
   private static final Map<String, ead> G = new Object2ObjectArrayMap();
   public static final Codec<ead> a = Codec.stringResolver(ead::b, G::get);
   public static final ead b = a(new ead("iron", false, false, false, ead.a.a, dtn.bo, awl.nP, awl.nQ, awl.nX, awl.nY, awl.pq, awl.pr, awl.Ac, awl.Ad));
   public static final ead c = a(new ead("copper", true, true, false, ead.a.a, dtn.aj, awl.fP, awl.fQ, awl.fW, awl.fX, awl.pq, awl.pr, awl.Ac, awl.Ad));
   public static final ead d = a(new ead("gold", false, true, false, ead.a.a, dtn.g, awl.nP, awl.nQ, awl.nX, awl.nY, awl.pq, awl.pr, awl.Ac, awl.Ad));
   public static final ead e = a(new ead("stone", true, true, false, ead.a.b, dtn.f, awl.nP, awl.nQ, awl.nX, awl.nY, awl.Ah, awl.Ai, awl.Ac, awl.Ad));
   public static final ead f = a(
      new ead("polished_blackstone", true, true, false, ead.a.b, dtn.f, awl.nP, awl.nQ, awl.nX, awl.nY, awl.Ah, awl.Ai, awl.Ac, awl.Ad)
   );
   public static final ead g = a(new ead("oak"));
   public static final ead h = a(new ead("spruce"));
   public static final ead i = a(new ead("birch"));
   public static final ead j = a(new ead("acacia"));
   public static final ead k = a(new ead("cherry", true, true, true, ead.a.a, dtn.aV, awl.eG, awl.eH, awl.eI, awl.eJ, awl.eM, awl.eN, awl.eK, awl.eL));
   public static final ead l = a(new ead("jungle"));
   public static final ead m = a(new ead("dark_oak"));
   public static final ead n = a(new ead("pale_oak"));
   public static final ead o = a(new ead("crimson", true, true, true, ead.a.a, dtn.aU, awl.rw, awl.rx, awl.ry, awl.rz, awl.rC, awl.rD, awl.rA, awl.rB));
   public static final ead p = a(new ead("warped", true, true, true, ead.a.a, dtn.aU, awl.rw, awl.rx, awl.ry, awl.rz, awl.rC, awl.rD, awl.rA, awl.rB));
   public static final ead q = a(new ead("mangrove"));
   public static final ead r = a(new ead("bamboo", true, true, true, ead.a.a, dtn.aT, awl.bo, awl.bp, awl.bq, awl.br, awl.bu, awl.bv, awl.bs, awl.bt));

   public ead(String $$0) {
      this($$0, true, true, true, ead.a.a, dtn.b, awl.DT, awl.DU, awl.DV, awl.DW, awl.DZ, awl.Ea, awl.DX, awl.DY);
   }

   private static ead a(ead $$0) {
      G.put($$0.s, $$0);
      return $$0;
   }

   public static Stream<ead> a() {
      return G.values().stream();
   }

   public String b() {
      return this.s;
   }

   public boolean c() {
      return this.t;
   }

   public boolean d() {
      return this.u;
   }

   public boolean e() {
      return this.v;
   }

   public ead.a f() {
      return this.w;
   }

   public dtn g() {
      return this.x;
   }

   public awk h() {
      return this.y;
   }

   public awk i() {
      return this.z;
   }

   public awk j() {
      return this.A;
   }

   public awk k() {
      return this.B;
   }

   public awk l() {
      return this.C;
   }

   public awk m() {
      return this.D;
   }

   public awk n() {
      return this.E;
   }

   public awk o() {
      return this.F;
   }

   public static enum a {
      a,
      b;
   }
}
