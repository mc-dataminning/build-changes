import com.google.common.collect.ImmutableMap;

public class eni {
   public static final enq a = new enq(0, enq.a.a, enq.b.a, 3);
   public static final enq b = new enq(0, enq.a.b, enq.b.c, 4);
   public static final enq c = new enq(0, enq.a.a, enq.b.d, 2);
   public static final enq d = new enq(1, enq.a.e, enq.b.d, 2);
   public static final enq e = new enq(2, enq.a.e, enq.b.d, 2);
   public static final enq f = new enq(0, enq.a.c, enq.b.b, 3);
   public static final enq g = new enq(0, enq.a.c, enq.b.e, 1);
   public static final enq h = c;
   public static final enp i = new enp(ImmutableMap.builder().put("Position", a).put("UV", h).put("Color", b).build());
   public static final enp j = new enp(
      ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV2", e).put("Normal", f).put("Padding", g).build()
   );
   public static final enp k = new enp(
      ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV1", d).put("UV2", e).put("Normal", f).put("Padding", g).build()
   );
   public static final enp l = new enp(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).put("UV2", e).build());
   public static final enp m = new enp(ImmutableMap.builder().put("Position", a).build());
   public static final enp n = new enp(ImmutableMap.builder().put("Position", a).put("Color", b).build());
   public static final enp o = new enp(ImmutableMap.builder().put("Position", a).put("Color", b).put("Normal", f).put("Padding", g).build());
   public static final enp p = new enp(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV2", e).build());
   public static final enp q = new enp(ImmutableMap.builder().put("Position", a).put("UV0", c).build());
   public static final enp r = new enp(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).build());
   public static final enp s = new enp(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).build());
   public static final enp t = new enp(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV2", e).build());
   public static final enp u = new enp(ImmutableMap.builder().put("Position", a).put("UV0", c).put("UV2", e).put("Color", b).build());
   public static final enp v = new enp(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).put("Normal", f).put("Padding", g).build());
}
