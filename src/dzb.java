import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dzb(String s, boolean t, boolean u, boolean v, dzb.a w, dsn x, awj y, awj z, awj A, awj B, awj C, awj D, awj E, awj F) {
   private static final Map<String, dzb> G = new Object2ObjectArrayMap();
   public static final Codec<dzb> a = Codec.stringResolver(dzb::b, G::get);
   public static final dzb b = a(new dzb("iron", false, false, false, dzb.a.a, dsn.bo, awk.nP, awk.nQ, awk.nX, awk.nY, awk.pq, awk.pr, awk.Ac, awk.Ad));
   public static final dzb c = a(new dzb("copper", true, true, false, dzb.a.a, dsn.aj, awk.fP, awk.fQ, awk.fW, awk.fX, awk.pq, awk.pr, awk.Ac, awk.Ad));
   public static final dzb d = a(new dzb("gold", false, true, false, dzb.a.a, dsn.g, awk.nP, awk.nQ, awk.nX, awk.nY, awk.pq, awk.pr, awk.Ac, awk.Ad));
   public static final dzb e = a(new dzb("stone", true, true, false, dzb.a.b, dsn.f, awk.nP, awk.nQ, awk.nX, awk.nY, awk.Ah, awk.Ai, awk.Ac, awk.Ad));
   public static final dzb f = a(
      new dzb("polished_blackstone", true, true, false, dzb.a.b, dsn.f, awk.nP, awk.nQ, awk.nX, awk.nY, awk.Ah, awk.Ai, awk.Ac, awk.Ad)
   );
   public static final dzb g = a(new dzb("oak"));
   public static final dzb h = a(new dzb("spruce"));
   public static final dzb i = a(new dzb("birch"));
   public static final dzb j = a(new dzb("acacia"));
   public static final dzb k = a(new dzb("cherry", true, true, true, dzb.a.a, dsn.aV, awk.eG, awk.eH, awk.eI, awk.eJ, awk.eM, awk.eN, awk.eK, awk.eL));
   public static final dzb l = a(new dzb("jungle"));
   public static final dzb m = a(new dzb("dark_oak"));
   public static final dzb n = a(new dzb("pale_oak"));
   public static final dzb o = a(new dzb("crimson", true, true, true, dzb.a.a, dsn.aU, awk.rw, awk.rx, awk.ry, awk.rz, awk.rC, awk.rD, awk.rA, awk.rB));
   public static final dzb p = a(new dzb("warped", true, true, true, dzb.a.a, dsn.aU, awk.rw, awk.rx, awk.ry, awk.rz, awk.rC, awk.rD, awk.rA, awk.rB));
   public static final dzb q = a(new dzb("mangrove"));
   public static final dzb r = a(new dzb("bamboo", true, true, true, dzb.a.a, dsn.aT, awk.bo, awk.bp, awk.bq, awk.br, awk.bu, awk.bv, awk.bs, awk.bt));

   public dzb(String $$0) {
      this($$0, true, true, true, dzb.a.a, dsn.b, awk.DT, awk.DU, awk.DV, awk.DW, awk.DZ, awk.Ea, awk.DX, awk.DY);
   }

   private static dzb a(dzb $$0) {
      G.put($$0.s, $$0);
      return $$0;
   }

   public static Stream<dzb> a() {
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

   public dzb.a f() {
      return this.w;
   }

   public dsn g() {
      return this.x;
   }

   public awj h() {
      return this.y;
   }

   public awj i() {
      return this.z;
   }

   public awj j() {
      return this.A;
   }

   public awj k() {
      return this.B;
   }

   public awj l() {
      return this.C;
   }

   public awj m() {
      return this.D;
   }

   public awj n() {
      return this.E;
   }

   public awj o() {
      return this.F;
   }

   public static enum a {
      a,
      b;
   }
}
