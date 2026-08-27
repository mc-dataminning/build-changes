import java.util.EnumMap;
import java.util.function.Supplier;

public enum cgm implements ask, cgl {
   a("leather", 5, ac.a(new EnumMap<>(cgk.a.class), $$0 -> {
      $$0.put(cgk.a.d, 1);
      $$0.put(cgk.a.c, 2);
      $$0.put(cgk.a.b, 3);
      $$0.put(cgk.a.a, 1);
   }), 15, aoz.ai, 0.0F, 0.0F, () -> cmb.a(cjd.pP)),
   b("chainmail", 15, ac.a(new EnumMap<>(cgk.a.class), $$0 -> {
      $$0.put(cgk.a.d, 1);
      $$0.put(cgk.a.c, 4);
      $$0.put(cgk.a.b, 5);
      $$0.put(cgk.a.a, 2);
   }), 12, aoz.ac, 0.0F, 0.0F, () -> cmb.a(cjd.nQ)),
   c("iron", 15, ac.a(new EnumMap<>(cgk.a.class), $$0 -> {
      $$0.put(cgk.a.d, 2);
      $$0.put(cgk.a.c, 5);
      $$0.put(cgk.a.b, 6);
      $$0.put(cgk.a.a, 2);
   }), 9, aoz.ah, 0.0F, 0.0F, () -> cmb.a(cjd.nQ)),
   d("gold", 7, ac.a(new EnumMap<>(cgk.a.class), $$0 -> {
      $$0.put(cgk.a.d, 1);
      $$0.put(cgk.a.c, 3);
      $$0.put(cgk.a.b, 5);
      $$0.put(cgk.a.a, 2);
   }), 25, aoz.ag, 0.0F, 0.0F, () -> cmb.a(cjd.nU)),
   e("diamond", 33, ac.a(new EnumMap<>(cgk.a.class), $$0 -> {
      $$0.put(cgk.a.d, 3);
      $$0.put(cgk.a.c, 6);
      $$0.put(cgk.a.b, 8);
      $$0.put(cgk.a.a, 3);
   }), 10, aoz.ad, 2.0F, 0.0F, () -> cmb.a(cjd.nK)),
   f("turtle", 25, ac.a(new EnumMap<>(cgk.a.class), $$0 -> {
      $$0.put(cgk.a.d, 2);
      $$0.put(cgk.a.c, 5);
      $$0.put(cgk.a.b, 6);
      $$0.put(cgk.a.a, 2);
   }), 9, aoz.ak, 0.0F, 0.0F, () -> cmb.a(cjd.nD)),
   g("netherite", 37, ac.a(new EnumMap<>(cgk.a.class), $$0 -> {
      $$0.put(cgk.a.d, 3);
      $$0.put(cgk.a.c, 6);
      $$0.put(cgk.a.b, 8);
      $$0.put(cgk.a.a, 3);
   }), 15, aoz.aj, 3.0F, 0.1F, () -> cmb.a(cjd.nV));

   public static final ask.a<cgm> h = ask.a(cgm::values);
   private static final EnumMap<cgk.a, Integer> i = ac.a(new EnumMap<>(cgk.a.class), $$0 -> {
      $$0.put(cgk.a.d, 13);
      $$0.put(cgk.a.c, 15);
      $$0.put(cgk.a.b, 16);
      $$0.put(cgk.a.a, 11);
   });
   private final String j;
   private final int k;
   private final EnumMap<cgk.a, Integer> l;
   private final int m;
   private final aoy n;
   private final float o;
   private final float p;
   private final arn<cmb> q;

   private cgm(String $$0, int $$1, EnumMap<cgk.a, Integer> $$2, int $$3, aoy $$4, float $$5, float $$6, Supplier<cmb> $$7) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.n = $$4;
      this.o = $$5;
      this.p = $$6;
      this.q = new arn<>($$7);
   }

   @Override
   public int a(cgk.a $$0) {
      return i.get($$0) * this.k;
   }

   @Override
   public int b(cgk.a $$0) {
      return this.l.get($$0);
   }

   @Override
   public int a() {
      return this.m;
   }

   @Override
   public aoy b() {
      return this.n;
   }

   @Override
   public cmb d() {
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
