import java.util.EnumMap;
import java.util.function.Supplier;

public enum cgt implements asr, cgs {
   a("leather", 5, ac.a(new EnumMap<>(cgr.a.class), $$0 -> {
      $$0.put(cgr.a.d, 1);
      $$0.put(cgr.a.c, 2);
      $$0.put(cgr.a.b, 3);
      $$0.put(cgr.a.a, 1);
   }), 15, apf.ai, 0.0F, 0.0F, () -> cmi.a(cjk.pP)),
   b("chainmail", 15, ac.a(new EnumMap<>(cgr.a.class), $$0 -> {
      $$0.put(cgr.a.d, 1);
      $$0.put(cgr.a.c, 4);
      $$0.put(cgr.a.b, 5);
      $$0.put(cgr.a.a, 2);
   }), 12, apf.ac, 0.0F, 0.0F, () -> cmi.a(cjk.nQ)),
   c("iron", 15, ac.a(new EnumMap<>(cgr.a.class), $$0 -> {
      $$0.put(cgr.a.d, 2);
      $$0.put(cgr.a.c, 5);
      $$0.put(cgr.a.b, 6);
      $$0.put(cgr.a.a, 2);
   }), 9, apf.ah, 0.0F, 0.0F, () -> cmi.a(cjk.nQ)),
   d("gold", 7, ac.a(new EnumMap<>(cgr.a.class), $$0 -> {
      $$0.put(cgr.a.d, 1);
      $$0.put(cgr.a.c, 3);
      $$0.put(cgr.a.b, 5);
      $$0.put(cgr.a.a, 2);
   }), 25, apf.ag, 0.0F, 0.0F, () -> cmi.a(cjk.nU)),
   e("diamond", 33, ac.a(new EnumMap<>(cgr.a.class), $$0 -> {
      $$0.put(cgr.a.d, 3);
      $$0.put(cgr.a.c, 6);
      $$0.put(cgr.a.b, 8);
      $$0.put(cgr.a.a, 3);
   }), 10, apf.ad, 2.0F, 0.0F, () -> cmi.a(cjk.nK)),
   f("turtle", 25, ac.a(new EnumMap<>(cgr.a.class), $$0 -> {
      $$0.put(cgr.a.d, 2);
      $$0.put(cgr.a.c, 5);
      $$0.put(cgr.a.b, 6);
      $$0.put(cgr.a.a, 2);
   }), 9, apf.ak, 0.0F, 0.0F, () -> cmi.a(cjk.nD)),
   g("netherite", 37, ac.a(new EnumMap<>(cgr.a.class), $$0 -> {
      $$0.put(cgr.a.d, 3);
      $$0.put(cgr.a.c, 6);
      $$0.put(cgr.a.b, 8);
      $$0.put(cgr.a.a, 3);
   }), 15, apf.aj, 3.0F, 0.1F, () -> cmi.a(cjk.nV));

   public static final asr.a<cgt> h = asr.a(cgt::values);
   private static final EnumMap<cgr.a, Integer> i = ac.a(new EnumMap<>(cgr.a.class), $$0 -> {
      $$0.put(cgr.a.d, 13);
      $$0.put(cgr.a.c, 15);
      $$0.put(cgr.a.b, 16);
      $$0.put(cgr.a.a, 11);
   });
   private final String j;
   private final int k;
   private final EnumMap<cgr.a, Integer> l;
   private final int m;
   private final ape n;
   private final float o;
   private final float p;
   private final art<cmi> q;

   private cgt(String $$0, int $$1, EnumMap<cgr.a, Integer> $$2, int $$3, ape $$4, float $$5, float $$6, Supplier<cmi> $$7) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.n = $$4;
      this.o = $$5;
      this.p = $$6;
      this.q = new art<>($$7);
   }

   @Override
   public int a(cgr.a $$0) {
      return i.get($$0) * this.k;
   }

   @Override
   public int b(cgr.a $$0) {
      return this.l.get($$0);
   }

   @Override
   public int a() {
      return this.m;
   }

   @Override
   public ape b() {
      return this.n;
   }

   @Override
   public cmi d() {
      return this.q.a();
   }

   @Override
   public String e() {
      return this.j;
   }

   @Override
   public float f() {
      return this.o;
   }

   @Override
   public float g() {
      return this.p;
   }

   @Override
   public String c() {
      return this.j;
   }
}
