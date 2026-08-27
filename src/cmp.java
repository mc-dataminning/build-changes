import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.function.Supplier;

public enum cmp implements axc, cmo {
   a("leather", 5, ac.a(new EnumMap<>(cmn.a.class), $$0 -> {
      $$0.put(cmn.a.d, 1);
      $$0.put(cmn.a.c, 2);
      $$0.put(cmn.a.b, 3);
      $$0.put(cmn.a.a, 1);
   }), 15, atl.at, 0.0F, 0.0F, () -> csc.a(cpg.qC)),
   b("chainmail", 15, ac.a(new EnumMap<>(cmn.a.class), $$0 -> {
      $$0.put(cmn.a.d, 1);
      $$0.put(cmn.a.c, 4);
      $$0.put(cmn.a.b, 5);
      $$0.put(cmn.a.a, 2);
   }), 12, atl.an, 0.0F, 0.0F, () -> csc.a(cpg.oD)),
   c("iron", 15, ac.a(new EnumMap<>(cmn.a.class), $$0 -> {
      $$0.put(cmn.a.d, 2);
      $$0.put(cmn.a.c, 5);
      $$0.put(cmn.a.b, 6);
      $$0.put(cmn.a.a, 2);
   }), 9, atl.as, 0.0F, 0.0F, () -> csc.a(cpg.oD)),
   d("gold", 7, ac.a(new EnumMap<>(cmn.a.class), $$0 -> {
      $$0.put(cmn.a.d, 1);
      $$0.put(cmn.a.c, 3);
      $$0.put(cmn.a.b, 5);
      $$0.put(cmn.a.a, 2);
   }), 25, atl.ar, 0.0F, 0.0F, () -> csc.a(cpg.oH)),
   e("diamond", 33, ac.a(new EnumMap<>(cmn.a.class), $$0 -> {
      $$0.put(cmn.a.d, 3);
      $$0.put(cmn.a.c, 6);
      $$0.put(cmn.a.b, 8);
      $$0.put(cmn.a.a, 3);
   }), 10, atl.ao, 2.0F, 0.0F, () -> csc.a(cpg.ox)),
   f("turtle", 25, ac.a(new EnumMap<>(cmn.a.class), $$0 -> {
      $$0.put(cmn.a.d, 2);
      $$0.put(cmn.a.c, 5);
      $$0.put(cmn.a.b, 6);
      $$0.put(cmn.a.a, 2);
   }), 9, atl.av, 0.0F, 0.0F, () -> csc.a(cpg.oo)),
   g("netherite", 37, ac.a(new EnumMap<>(cmn.a.class), $$0 -> {
      $$0.put(cmn.a.d, 3);
      $$0.put(cmn.a.c, 6);
      $$0.put(cmn.a.b, 8);
      $$0.put(cmn.a.a, 3);
   }), 15, atl.au, 3.0F, 0.1F, () -> csc.a(cpg.oI));

   public static final Codec<cmp> h = axc.a(cmp::values);
   private static final EnumMap<cmn.a, Integer> i = ac.a(new EnumMap<>(cmn.a.class), $$0 -> {
      $$0.put(cmn.a.d, 13);
      $$0.put(cmn.a.c, 15);
      $$0.put(cmn.a.b, 16);
      $$0.put(cmn.a.a, 11);
   });
   private final String j;
   private final int k;
   private final EnumMap<cmn.a, Integer> l;
   private final int m;
   private final atk n;
   private final float o;
   private final float p;
   private final awd<csc> q;

   private cmp(String $$0, int $$1, EnumMap<cmn.a, Integer> $$2, int $$3, atk $$4, float $$5, float $$6, Supplier<csc> $$7) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.n = $$4;
      this.o = $$5;
      this.p = $$6;
      this.q = new awd<>($$7);
   }

   @Override
   public int a(cmn.a $$0) {
      return i.get($$0) * this.k;
   }

   @Override
   public int b(cmn.a $$0) {
      return this.l.get($$0);
   }

   @Override
   public int a() {
      return this.m;
   }

   @Override
   public atk b() {
      return this.n;
   }

   @Override
   public csc d() {
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
