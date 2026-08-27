import com.google.common.collect.ImmutableMap;

public class enu {
   public static final eoc a = new eoc(0, eoc.a.a, eoc.b.a, 3);
   public static final eoc b = new eoc(0, eoc.a.b, eoc.b.c, 4);
   public static final eoc c = new eoc(0, eoc.a.a, eoc.b.d, 2);
   public static final eoc d = new eoc(1, eoc.a.e, eoc.b.d, 2);
   public static final eoc e = new eoc(2, eoc.a.e, eoc.b.d, 2);
   public static final eoc f = new eoc(0, eoc.a.c, eoc.b.b, 3);
   public static final eoc g = new eoc(0, eoc.a.c, eoc.b.e, 1);
   public static final eoc h = c;
   public static final eob i = new eob(ImmutableMap.builder().put("Position", a).put("UV", h).put("Color", b).build());
   public static final eob j = new eob(
      ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV2", e).put("Normal", f).put("Padding", g).build()
   );
   public static final eob k = new eob(
      ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV1", d).put("UV2", e).put("Normal", f).put("Padding", g).build()
   );
   public static final eob l = new eob(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).put("UV2", e).build());
   public static final eob m = new eob(ImmutableMap.builder().put("Position", a).build());
   public static final eob n = new eob(ImmutableMap.builder().put("Position", a).put("Color", b).build());
   public static final eob o = new eob(ImmutableMap.builder().put("Position", a).put("Color", b).put("Normal", f).put("Padding", g).build());
   public static final eob p = new eob(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV2", e).build());
   public static final eob q = new eob(ImmutableMap.builder().put("Position", a).put("UV0", c).build());
   public static final eob r = new eob(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).build());
   public static final eob s = new eob(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).build());
   public static final eob t = new eob(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV2", e).build());
   public static final eob u = new eob(ImmutableMap.builder().put("Position", a).put("UV0", c).put("UV2", e).put("Color", b).build());
   public static final eob v = new eob(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).put("Normal", f).put("Padding", g).build());
}
